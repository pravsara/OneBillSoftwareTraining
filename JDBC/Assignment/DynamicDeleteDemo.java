package com.onebill.jdbc.basics.Assignment;
import java.sql.*;
import java.util.Scanner;

public class DynamicDeleteDemo {

	static Connection con;
	static PreparedStatement pstmt;

	public static void main(String[] args) {
		try {

			DriverManager.registerDriver(new com.mysql.jdbc.Driver());

			con = DriverManager
					.getConnection("jdbc:mysql://localhost:3307/OneBillStudent?user=root&password=Praveen");

			String query = "delete from Student where sid=?";
			pstmt = con.prepareStatement(query);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the student id : ");
			int s_id = sc.nextInt();

			pstmt.setInt(1, s_id);

			int res = pstmt.executeUpdate();
			if (res > 0) {
				System.out.println("Student Record deleted succesfully!");
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
				System.out.println("Exception Occured!");
			}
			
			
		}
		

	}

}