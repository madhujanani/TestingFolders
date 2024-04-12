package com.file;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.sql.Statement;

public class PrepareStmt {
	public static void main(String[] args) {
		
	
	Connection con=null;
	Statement st=null;
	PreparedStatement pre =null;
	String query= "insert into madhu_jdbc.Employee values(? ? ?) ";

	
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");

		st.executeUpdate(query);
		 pre = con.prepareStatement(query);
		 pre.setInt(1, 21);pre.setString(2, "Mala");pre.setString(3, "chennai");pre.setString(4, "F");
		 pre.setInt(5, 1234567898);
		 
		 System.out.println(pre.executeUpdate());
	}
	catch (ClassNotFoundException |SQLException e) {
		e.printStackTrace();
	}
	finally {
		try {
			pre.close();
			st.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}
}
