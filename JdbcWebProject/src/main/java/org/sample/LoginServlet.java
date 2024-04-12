package org.sample;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Connection  cnn =(Connection)getServletContext().getAttribute("ourRefName");
		System.out.println(cnn);
		HttpSession ss = request.getSession();
		try {
			
			Thread.sleep(2000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		ss.invalidate();
		}
	

}
