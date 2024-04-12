package org.sessionmgt;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class Login1servlet
 */
public class Login1servlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String [] names = new String[] {"AB","CD","EF","GH","IJ","KL"};
	HttpSession sesn = request.getSession();
	sesn.setAttribute("ourOwnName", names);
	String a= "HelloWorld";
	response.getWriter().print("<a href ='Face' ? to Write==url&pass==display"+a+">homelink</a>");
	
	}

	

}
