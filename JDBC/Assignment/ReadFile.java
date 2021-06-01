package com.onebill.jdbc.basics.Assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;

public class ReadFile {

	static Connection con;
	static PreparedStatement pstmt;

	public static void main(String[] args) {
		try {
			// 1.load the driver

			DriverManager.registerDriver(new com.mysql.jdbc.Driver());

			// 2.get conn db

			con = DriverManager
					.getConnection("jdbc:mysql://localhost:3307/OneBillStudent?user=root&password=Praveen");

			String query = "insert into Student values(?,?,?)";
			pstmt = con.prepareStatement(query);

			// read the input from file

			FileReader read = new FileReader(
					" E:/eclipse-workspace/JDBCImp/src/com/onebill/jdbc/basics/Assignment/file.txt");
			BufferedReader br = new BufferedReader(read);
			// read the data line by line
			String lineData = null;
			String[] data = null;
			while ((lineData = br.readLine()) != null) {
				data = lineData.split(" ");
				System.out.println(lineData);
			}
			pstmt.setInt(1, Integer.parseInt(data[0]));
			pstmt.setString(2, data[1]);
			pstmt.setInt(3, Integer.parseInt(data[2]));

			int res = pstmt.executeUpdate();
			if (res > 0) {
				System.out.println("Student Record inserted succesfully!");
			}
			read.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 5.close all jdbc objects
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
				System.out.println("Exception Generated during close the JDBC objects!!");
			}
		}

	}

}
