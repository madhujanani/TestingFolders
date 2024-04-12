package org.sessionmgtHdnUrlrewrt;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		response.getWriter().print("<form action = 'fase'>"+"<input type ='hidden' name ='role' value = 'trainer'/>"
				+ "<input type = 'submit'/>"+"<form");
		
		String A = "helloworld";
		response.getWriter().print("<a href ='fase'? myrole ="+A+"&date =='12-7-1956'>bailey</a>");
		
	}

}
