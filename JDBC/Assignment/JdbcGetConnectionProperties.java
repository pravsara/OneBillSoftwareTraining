package com.onebill.jdbc.basics.Assignment;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JdbcGetConnectionProperties {

	static Connection con;
	static Statement stmt;
	static ResultSet res;

	public static void main(String[] args) {

		try {
			
			Properties prop = new Properties();
			InputStream in = new FileInputStream(
					"E:/eclipse-workspace/JDBCImp/src/com/onebill/jdbc/basics/Assignment/jdbc.properties");
			prop.load(in);

			String driver_url = prop.getProperty("MYSQLJDBC.driver");

			// 1. 
			Class.forName(driver_url);
			String db_url = prop.getProperty("MYSQLJDBC.url");
			String user = prop.getProperty("MYSQLJDBC.username");
			String password = prop.getProperty("MYSQLJDBC.password");
			// 2.
			System.out.println(db_url+user+password);
			con = DriverManager.getConnection(db_url, user, password);
			// 3.
			String query = "select * from employee";
			stmt = con.createStatement();
			// 4.
			res = stmt.executeQuery(query);
			while (res.next()) {
				int emp_id = res.getInt("empid");
				String emp_name = res.getString("empname");
				int emp_salary = res.getInt("empsalary");
				System.out.println(emp_id + " " + emp_name + " " + emp_salary + " ");
			}

			System.out.println("Table created Successfully!");
			prop.clear();

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				// 5.
				if (con != null)
					con.close();
				if (stmt != null)
					stmt.close();
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}
