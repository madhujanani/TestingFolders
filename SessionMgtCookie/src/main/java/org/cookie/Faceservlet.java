package org.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Base64;

/**
 * Servlet implementation class Faceservlet
 */
public class Faceservlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	response.getWriter().print("faceservlet");
	Cookie[] ck = request.getCookies();
	for (Cookie cook : ck) {
		response.getWriter().print(cook.getName());
		response.getWriter().print(cook.getValue());
		String justget = cook.getValue();
		byte[] decval = Base64.getDecoder().decode(justget);
		String deval =new String();
		response.getWriter().print(deval);
		
	}
	
	}

}
