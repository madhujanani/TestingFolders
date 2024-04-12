package org.demo;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet Filter implementation class LoginFilter
 */
public class LoginFilter extends HttpFilter implements Filter {
       
   
    public LoginFilter() {
        super();
    }	
	public void destroy() {
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.getWriter().print("/n LoginFilter");
		String user = request.getParameter("Uname");
		String pass = request.getParameter("Upass");
		HttpServletResponse reqq =(HttpServletResponse)response;
		if (user.equalsIgnoreCase("Marjook")&& pass.equalsIgnoreCase("1234")) {
			chain.doFilter(request, response);
		} else {
			reqq.sendRedirect("Green/html");
		}
		
	}	
	
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
