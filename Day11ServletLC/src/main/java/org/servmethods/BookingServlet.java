package org.servmethods;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class BookingServlet
 */
public class BookingServlet extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("This is INIT method in BookingServlet class ");	
	}

	public void destroy() {
		System.out.println("This is DESTROY method in BookingServlet class ");	
	}	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("This is SERVICE method in BookingServlet class ");	
	}

}
