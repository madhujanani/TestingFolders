package org.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class MyListeners implements ServletContextListener {
	Connection con;

	@Override
	public void contextInitialized(ServletContextEvent sec) {
		System.out.println("Intalled");
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sec.getServletContext().setAttribute("ourRefName", sec);
}
	@Override
	public void contextDestroyed(ServletContextEvent sec) {
		System.out.println("closed");
		try {
			con.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}