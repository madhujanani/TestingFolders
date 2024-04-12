package org.reqdes;

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
		writer.println("Welcome to Booking servlet page");
		String nam = request.getParameter("Uname");
		String pas = request.getParameter("Upass");
		writer.println("Username is <b>"+nam+"</b>");
		writer.println("password is <b>"+pas+"</b>");	}

	

}
