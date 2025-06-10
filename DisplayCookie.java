package com.byjus;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DisplayCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookie = request.getCookies();
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		writer.println("<b>---------INFORMATION OF USER---------</b><br><br>");
		
		writer.println("name : "+cookie[0].getValue()+"<br><br>");
		writer.println("user age : "+cookie[1].getValue()+"<br><br>");
		writer.println("education : "+cookie[2].getValue()+"<br><br>");
		writer.println("feild of education : "+cookie[3].getValue()+"<br><br>");
		writer.println("village : "+request.getParameter("uvillage")+"<br><br>");
		writer.println("hobby : "+request.getParameter("uhobby")+"<br><br>");

		
	}

}
