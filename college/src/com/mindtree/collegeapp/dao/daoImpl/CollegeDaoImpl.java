package com.mindtree.collegeapp.dao.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mindtree.collegeapp.dao.CollegeDao;
import com.mindtree.collegeapp.utility.DbConnection;

public class CollegeDaoImpl implements CollegeDao {
	
		
	public String addCollege(int univId, int collegeId, String collegeName, int rating) {
	String message="";
	try {
				Connection connection = DbConnection.getConnection();
				if (connection != null)
					System.out.println("Connected");

				String sql = "INSERT INTO college(univId,collegeId,collegeName,rating) VALUES(?,?,?,?)";
				PreparedStatement statement = connection.prepareStatement(sql);

				statement.setInt(1, univId);
				statement.setInt(2, collegeId);
				
				statement.setString(3,collegeName);
				statement.setInt(4, rating);
				int rowsInserted = statement.executeUpdate();
				statement.getGeneratedKeys();
				if (rowsInserted > 0) {
					System.out.println("A new college added");
				}

				DbConnection.closeConnection(connection);}
			 catch (Exception ex) {
				System.out.println(ex.getLocalizedMessage());
				message = ex.getMessage();
			}

		return null;
	}

}
