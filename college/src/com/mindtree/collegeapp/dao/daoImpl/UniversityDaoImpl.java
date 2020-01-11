package com.mindtree.collegeapp.dao.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mindtree.collegeapp.dao.UniversityDao;
import com.mindtree.collegeapp.entity.College;
import com.mindtree.collegeapp.entity.University;
import com.mindtree.collegeapp.utility.DbConnection;

public class UniversityDaoImpl implements UniversityDao {
	public String insertUniversity(int univId, String univName) {
		String message = "";

		try {
			Connection connection = DbConnection.getConnection();
			if (connection != null)
				System.out.println("Connected");

			String sql = "INSERT INTO university(univId,univName) VALUES(?,?)";
			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setInt(1, univId);
			statement.setString(2, univName);
			int rowsInserted = statement.executeUpdate();
			statement.getGeneratedKeys();
			if (rowsInserted > 0) {
				System.out.println("A new University inserted");
			}

			DbConnection.closeConnection(connection);
		} catch (Exception ex) {
			System.out.println(ex.getLocalizedMessage());
			message = ex.getMessage();
		}

		return null;
	}

	public List<University> getUniv() {
		ArrayList<University> list2 = new ArrayList<University>();
		String message = "";
		Connection connection = null;

		try {
			connection = DbConnection.getConnection();
			if (connection != null)
				System.out.println("Connected");

			String sql = "select *from university";
			PreparedStatement ps = connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				University univ = new University();

				univ.setUnivId(rs.getInt("univId"));
				univ.setUnivName(rs.getString("univName"));
				list2.add(univ);

			}

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		return list2;
	}

	public List<College> getCollege(int univId) {

		ArrayList<College> list3 = new ArrayList<College>();
		String message = "";
		Connection connection = null;

		try {
			connection = DbConnection.getConnection();
			if (connection != null)
				System.out.println("Connected");

			String sql = "select collegeId,collegeName from college where univId=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, univId);
			ResultSet rs = ps.executeQuery();
			// STEP 5: Extract data from result set
			while (rs.next()) {
				College clg = new College();
				clg.setCollegeId(rs.getInt("collegeId"));
				clg.setCollegeName(rs.getString("collegeName"));
				list3.add(clg);
			}

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		return list3;

	}
}
