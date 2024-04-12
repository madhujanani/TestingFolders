package org.reqdes;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * Servlet implementation class LoginPageServlet
 */
@WebServlet(urlPatterns= {"/LogPageServlet"},initParams= {@WebInitParam(name="maxlmt",value="14")})
public class LoginPageServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("Welcome to loinServlet page");
		String nam = request.getParameter("Uname");
		String pas = request.getParameter("Upass");

		Map<String, String[]> map = request.getParameterMap();
		Set<Entry<String, String[]>> entrySet = map.entrySet();
		Iterator<Entry<String, String[]>> iter = entrySet.iterator();
		while (iter.hasNext()) {
			Entry<String, String[]> next = iter.next();
			writer.println(next.getKey()+"----->"+next.getValue());
			String inpVal = next.getValue().toString();
			if (inpVal.equalsIgnoreCase("MaRJook")&& inpVal.equalsIgnoreCase("12345")) {
			
				writer.println("Hi marjook Welcome to j2ee");
				RequestDispatcher dispatcher = request.getRequestDispatcher("BookingServlet");
				dispatcher.forward(request, response);
				
			} else {
//				writer.println("Hello share your name please");
//				RequestDispatcher dispatcher = request.getRequestDispatcher("LoginPageServlet/html");
//				dispatcher.include(request, response);
				response.sendError(401);
			}
		}
	}

	}


