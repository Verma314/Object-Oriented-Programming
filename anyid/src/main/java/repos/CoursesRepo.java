package repos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import models.Course;

@Repository
public class CoursesRepo {
	
	public static void main(String[] args) {
		List<Course> courses = new CoursesRepo().findAllCourses();
		System.out.println(courses);
	}
	
	
	// / JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/test";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "Sapient123";

	public List<Course> findAllCourses() {
		Connection conn = null;
		Statement stmt = null;
		List<Course> courses = new ArrayList<Course>();
		ResultSet rs = null;
		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to a selected database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected database successfully...");

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();

			String sql = "SELECT id, name, summary FROM course";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				// Retrieve by column name
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String summary = rs.getString("summary");

				Course course = new Course(id, name, summary);
				courses.add(course);
			}
		
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			if ( rs != null ) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if ( stmt != null ) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if ( conn != null ) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}			
						
			
			
			
		}
		return courses;
/*		Course temp = new Course(1, "as", "summary");
		ArrayList<Course> temp2 = new ArrayList<Course>();
		temp2.add(temp);
		return temp2;*/
	}

}
