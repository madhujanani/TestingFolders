package org.servmethods;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class ServletMethods extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		
		System.out.println("This is INIT method in ServletMethods class ");	
	}

	public void destroy() {
		System.out.println("This is DESTROY method in ServletMethods class");	

	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("This is SERVICE method in ServletMethods class");
		response.getWriter().print("hello");
	}

}
