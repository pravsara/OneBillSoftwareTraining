package com.onebill.jdbc.basics.Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDataBaseBankTable {
	
	static Connection con = null;
	static Statement stmt = null;

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/OneBillbankdb?user=root & password= Praveen");
			String query = "create table employee(empid int primary key, empname varchar(50), empsalary int)";
			stmt = con.createStatement();
			int count = stmt.executeUpdate(query);
			System.out.println("Table Created");
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

