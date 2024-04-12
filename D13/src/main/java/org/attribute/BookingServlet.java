package org.attribute;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class BookingServlet
 */
public class BookingServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("booking Servlet");
		
		//requestAttribute
		String attribute = (String) request.getAttribute("helloworld");
		response.getWriter().print(attribute);
		// session Attribute
		HttpSession session = request.getSession();
		String ssn = (String) session.getAttribute("Session");
		response.getWriter().print(ssn);

		// contextAttribute
		ServletContext context = request.getServletContext();
		String cntt = (String) context.getAttribute("context");
		response.getWriter().print(cntt);

	}

}
