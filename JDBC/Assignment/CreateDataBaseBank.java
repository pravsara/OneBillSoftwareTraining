package com.onebill.jdbc.basics.Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDataBaseBank {
	
	static Connection con = null;
	static Statement stmt = null;

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/OneBillStudent?user=root & password= Praveen");
			String query = "create database onebillbankdb";
			stmt = con.createStatement();
			int count = stmt.executeUpdate(query);
			System.out.println(count+" Database Created");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null) 
					con.close();
				if(stmt != null)
					stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		

	}

}
