package org.booking;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class BookingServlet
 */
public class BookingServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		
			writer.print("Welcome to Authentication topic");
			writer.print("J2ee Exception included");
			String user = request.getParameter("Uname");
			String pass = request.getParameter("Upass");
			writer.print(user);
			writer.print(pass);
			if (user.equalsIgnoreCase("MArjook")&& pass.equalsIgnoreCase("12345")) {
				writer.print("Hello welcome to Browser page");
				
			} else {
				response.sendError(401);

			}

			
	}

}
