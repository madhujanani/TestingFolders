package org.attribute;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String user = request.getParameter("Madhu");
			String pass = request.getParameter("1235");
			
			//requestAttribute
			String role = "Student";
			request.setAttribute("helloworld", role);
			// session Attribute
			String s[]=new String [] {"abc","def","ghi","jkl"};
			HttpSession session = request.getSession();
			session.setAttribute("Session", s);
			// contextAttribute
			String ca[]=new String [] {"mad","huj","ana","nim"};
			ServletContext context = request.getServletContext();
			context.setAttribute("context", ca);
			if (user.equalsIgnoreCase("MARjook")) {
				role ="Trainer";
			} 
			RequestDispatcher dispatcher = request.getRequestDispatcher("BokingServlet");
			dispatcher.forward(request, response);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			


	}



}
