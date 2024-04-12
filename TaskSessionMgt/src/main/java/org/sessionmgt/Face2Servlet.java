package org.sessionmgt;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class Face2Servlet
 */
public class Face2Servlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().print("FaceServlet");
		HttpSession sesn = request.getSession();
		String []nam =(String[])sesn.getAttribute("ourOwnName");
		for (String str : nam) {
			response.getWriter().print(str);
		}
		
	}

}
