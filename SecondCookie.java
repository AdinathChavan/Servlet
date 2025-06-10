package com.byjus;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SecondCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondCookie() {
        super();
        // TODO Auto-generated constructor stub
    }
   

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String ueducation= request.getParameter("ueducation");
		String ufeild= request.getParameter("ufeild");
		
		Cookie cookie3 = new Cookie("ueducation",ueducation);
		Cookie cookie4 = new Cookie("ufeild",ufeild);
		response.addCookie(cookie3);
		response.addCookie(cookie4);
		
		request.getRequestDispatcher("form3.html").forward(request, response);
		
	}

}
