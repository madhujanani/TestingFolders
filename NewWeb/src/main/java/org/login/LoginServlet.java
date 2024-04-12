package org.login;

import jakarta.servlet.ServletConfig;
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
import java.util.Map.Entry;
import java.util.Set;

/**
 * Servlet implementation class LoginServlet
 *///remove the login sevlet steps in web.xml as we are using annotation here .
//as my server is not working i am keeping it .remove from line no17-30
@WebServlet(urlPatterns = {"/LoginServlet"},initParams= {@WebInitParam (name="MaxPswd", value = "12")})
public class LoginServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	response.setContentType("text/html");
	PrintWriter writer = response.getWriter();
	writer.print("Welcome to j2EE<br>");
	
	String user = request.getParameter("hello");
	String pass = request.getParameter("123456");
//	
//	writer.print("Username to display<b><br>"+user+"</b>");
//	writer.print("password to display<b><br>"+pass+"</b>");
	
	Map<String, String[]> parameterMap = request.getParameterMap();
	Set<Entry<String, String[]>> entrySet = parameterMap.entrySet() ;
	Iterator<Entry<String, String[]>> iter = entrySet.iterator();
	while (iter.hasNext()) {
		Entry<String, String[]> next = iter.next();
		writer.print(next.getKey()+""+next.getValue());
		
	}
	
	
	ServletConfig config = getServletConfig();
	String  pswdLength = config.getInitParameter("PswdMinVal");
	int pswwd = Integer.parseInt(pswdLength);
	
	if (pass.length()>=pswwd) {
		if (user.equalsIgnoreCase("MArjook")) {
			writer.print("Hello marjook welcome to browser");
			
		} 
		else {
			writer.print("Share your name please");
		}
		
	} else {
		writer.print("check your password length");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
