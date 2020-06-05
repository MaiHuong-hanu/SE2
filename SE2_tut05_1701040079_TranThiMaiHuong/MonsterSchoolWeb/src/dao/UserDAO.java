package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnect;
import model.User;

/**
 * This is a DAO (DATA ACCESS OBJECT) class which provides CRUD (CREATE - READ -
 * UPDATE - DELETE) database operations for the table user in the database
 */
public class UserDAO {

	public UserDAO() {
	}

	public List<User> selectAllUsers() {

		List<User> users = new ArrayList<>();
		// Step 1: Establishing a Connection
		Connection connection = DBConnect.getConnection();
		try {
			// Step 2:Create a statement using connection object
			String SELECT_ALL_USERS = "SELECT * FROM user";
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();
			// Step 4: Process the ResultSet object
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String address = rs.getString("address");
				String mobile = rs.getString("mobile");
				users.add(new User(id, name, address, mobile));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}

	public void insertUser(User user) {
		Connection connection = DBConnect.getConnection();
		try {
			String INSERT_USER = "INSERT INTO user" + "(name, address,mobile)VALUES" + "(?,?,?)";
			PreparedStatement prepareStatement = connection.prepareStatement(INSERT_USER);
			prepareStatement.setString(1, user.getName());
			prepareStatement.setString(2, user.getAddress());
			prepareStatement.setString(3, user.getMobile());
			prepareStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void editUser(int id, String name, String address, String mobile) {
		Connection connection = DBConnect.getConnection();

		try {
			String INSERT_USER = "UPDATE user SET name="+"?"
		+",address="+"?"+",mobile="+"?"+ "WHERE id=" + "?";
			PreparedStatement prepareStatement = connection.prepareStatement(INSERT_USER);
			prepareStatement.setString(1, name);
			prepareStatement.setString(2, address);
			prepareStatement.setString(3, mobile);
			prepareStatement.setInt(4, id);
			prepareStatement.executeUpdate();
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void deleteUser(int id) {
		Connection connection = DBConnect.getConnection();

		try {
			String DELETE_USER = "DELETE FROM user WHERE id="+"?";
			PreparedStatement prepareStatement = connection.prepareStatement(DELETE_USER);
			prepareStatement.setInt(1, id);

			prepareStatement.executeUpdate();
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public User selectUser(int id) {
		User user = null;
		Connection connection = DBConnect.getConnection();
		try {
			String SELECT_USER = "select * from user where id=" + "?";
			PreparedStatement prepareStatement = connection.prepareStatement(SELECT_USER);
			prepareStatement.setInt(1, id);
			prepareStatement.execute();

		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return user;

	}
}
