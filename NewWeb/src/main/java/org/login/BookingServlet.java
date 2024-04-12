package org.login;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class BookingServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.print("Welcome to Booking Servlet<br>");
		
		String user = request.getParameter("hello");
		String pass = request.getParameter("123456");
		
		writer.print("Username to display<b><br>"+user+"</b>");
		writer.print("password to display<b><br>"+pass+"</b>");
		
		ServletConfig config = getServletConfig();
		String  pswdLength = config.getInitParameter("PswdMinVal");
		
		ServletContext context = getServletContext();
		context.getInitParameter("MaxPswd");
		int pswwd = Integer.parseInt(pswdLength);
		
		if (pass.length()>=pswwd) {
			if (user.equalsIgnoreCase("JOkmmar")) {
				
				writer.print("Hello JOkmmar welcome to browser");
				
			} 
			else {
				writer.print("Share your name please");
			}
			
		} else {
			writer.print("check your password length");

		}
		
	}

}
