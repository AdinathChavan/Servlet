package com.infoysis;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String uhobby = request.getParameter("uhobby");
		String uvillage = request.getParameter("uvillage");
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		HttpSession session = request.getSession(false);
		
		writer.println("<html>");
		writer.println("<body bgcolour='yellow'>");
		
		writer.println(" <b> -----ALL THE INFORMATION OF PERSON------</b> <br> <br> ");
		
		writer.println("  name - "+session.getValue("uname")); writer.println("<br><br>");
		
		writer.println("  age - "+session.getAttribute("uage"));   writer.println("<br><br>");
		
		writer.println("  education - "+session.getAttribute("ueducation"));	writer.println("<br><br>");
		
		writer.println("  feild of education - "+session.getAttribute("ufeild"));	writer.println("<br><br>");
		
		writer.println("  hobby - "+request.getParameter("uhobby"));	writer.println("<br><br>");
		
		writer.println("  village - "+request.getParameter("uvillage"));	writer.println("<br><br>");
		
		writer.println("</body>");
		writer.println("</html>");
	}

}
