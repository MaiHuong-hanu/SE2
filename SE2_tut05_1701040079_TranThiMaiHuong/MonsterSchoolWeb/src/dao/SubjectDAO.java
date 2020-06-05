package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnect;
import model.Subject;

/**
 * This is a DAO (DATA ACCESS OBJECT) class which provides 
 * CRUD (CREATE - READ - UPDATE - DELETE) database operations 
 * for the table user in the database
 */
public class SubjectDAO {

	public SubjectDAO() {
	}

	public List<Subject> selectAllSubjects() {

		List<Subject> subjects = new ArrayList<>();
		// Step 1: Establishing a Connection
		Connection connection = DBConnect.getConnection();
		try {
			// Step 2:Create a statement using connection object
			String SELECT_ALL_SUBJECT = "SELECT * FROM subject";
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_SUBJECT);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();
			// Step 4: Process the ResultSet object
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String level = rs.getString("level");
				
				subjects.add(new Subject(id, name, level));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return subjects;
	}
}
