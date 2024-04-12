package com.file;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class CreateStmt {
	public static void main(String[] args) {
				
		Connection con=null;
		Statement st=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			//to insert data in table
			//String query= "insert into madhu_jdbc.Employee values(123,'Anitha','cochin','F',1234567890)";
			//to print in console
			String query= "select * from madhu_jdbc.Employee ";

			st = con.createStatement();
			//System.out.println(st.executeQuery(query));
			ResultSet set = st.executeQuery(query);
			while(set.next()) {
				System.out.println(set.getInt(1) +"\t"+
				set.getString(2)+"\t"+set.getString(3)+"\t"+set.getString(4)+"\t"+set.getLong(5));
			}
			
			
		}
		catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
