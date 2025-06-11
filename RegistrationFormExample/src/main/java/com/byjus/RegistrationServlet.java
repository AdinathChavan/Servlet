package com.byjus;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		String uname=request.getParameter("uname");
		String mobileno=request.getParameter("umobileno");
		String umail=request.getParameter("umail");
		
		String [] qualification = request.getParameterValues("qualification");
		String gender= request.getParameter("gender");
		
		String[] technologies=request.getParameterValues("technologies");
		String address= request.getParameter("address");
		
		
		writer.println("<html>"); writer.println("<br> <br>");
		writer.println("<body bgcolor='pink'>"); writer.println("<br> <br>");
		writer.println(" Name of user : "+uname); writer.println("<br> <br>");
		writer.println(" Mobile no : "+mobileno); writer.println("<br> <br>");
		writer.println(" Email id : "+umail); writer.println("<br> <br>");
		writer.print(" Qualification : ");
		for(String uqual : qualification) {
			writer.println(uqual+" ");
		}
		writer.println("<br><br>");
		writer.println(" Gender : "+gender);writer.println("<br><br>");
		writer.print("Technologies : ");
		for(String tech : technologies) {
			writer.println(tech+" ");
		}
		writer.println("<br><br>");
		writer.println(" Addrerss : "+address); writer.println("<br> <br>");
		writer.println("</html>");
		writer.println("</body>");
	}

}
