package com.byjus;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public FirstCookie() {
        super();
        // TODO Auto-generated constructor stub
    }
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname= request.getParameter("uname");
		String uage= request.getParameter("uage");
		
		Cookie cookie1 = new Cookie("uname",uname);
		Cookie cookie2 = new Cookie("uage",uage);
		
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		request.getRequestDispatcher("form2.html").forward(request, response);
	}

}
