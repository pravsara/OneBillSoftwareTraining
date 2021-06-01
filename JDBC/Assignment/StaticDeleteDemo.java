
import java.sql.*;
public class StaticDeleteDemo {

	static Connection con = null;
	static Statement stmt = null;
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/OneBillStudent?user=root & password= Praveen");
			String query = "delete from student where sid = 2";
			stmt = con.createStatement();
			int count = stmt.executeUpdate(query);
			System.out.println(count+" Deleted");
		} catch (Exception e) {
			System.out.println("Exception occured");
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
