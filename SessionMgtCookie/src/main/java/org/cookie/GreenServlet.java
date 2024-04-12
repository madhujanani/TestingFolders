package org.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Base64;



/**
 * Servlet implementation class GreenServlet
 */
public class GreenServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name = request.getParameter("uname");
		String pass = request.getParameter("upass");
		String val = name+"&&&"+pass;
		byte[] encode = Base64.getEncoder().encode(val.getBytes());
		String encval = new String(encode);
		
		if (name.equalsIgnoreCase("Marjook")&& pass.equals("1234")) {
			Cookie cookie = new Cookie("user",val);
			response.addCookie(cookie);
			response.getWriter().print("<a href='Face'>bailinkname</a>");
			
		}

	}

}
;