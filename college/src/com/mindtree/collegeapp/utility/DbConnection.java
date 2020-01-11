package com.mindtree.collegeapp.utility;

import java.sql.Connection;
import java.sql.DriverManager;

	/**
	 * @author M1056063
	 *
	 */
	public class DbConnection {
		private static final String DB_URL = "jdbc:mysql://localhost:3306/collegeuniv";
		private static final String USERNAME = "root";
		private static final String PASSWORD = "Welcome123";

		/**
		 * @return
		 */
		public static Connection getConnection()   {
			Connection connection = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

			} catch (Exception e) {
			       e.printStackTrace();
			}
			return connection;
			

		}

		/**
		 * @param connection
		 * @return
		 */
		public static String closeConnection(Connection connection) {
			String result = "";
			try {
				connection.close();
				result = "Succesfully closed the connection object";
			} catch (Exception ex) {
				result = ex.getLocalizedMessage();
			}
			return result;
		}
	}

