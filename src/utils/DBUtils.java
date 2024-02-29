/**=================================================================
 * System name  : FINAL.JPL
 * Package name : fl.utils
 * File name    : DBUtils.java
 * Version:	1.0
 * Created date :Feb 20, 2023 11:15:36 AM
 * Description  : Create by Dat Ho
 * Copyright (c) 2023 . All rights reserved. 
 =================================================================*/
package utils;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class DBUtils {
	public static Connection getConnection() throws SQLException {
		String connectionURL = "jdbc:sqlserver://localhost;databaseName=Test;"
				+ "encrypt=true;trustServerCertificate=true;";
		String user = "sa";
		String password = "123456";
		return DriverManager.getConnection(connectionURL, user, password);
	}

	/**
	 * Close connection.
	 *
	 * @param c the c
	 */
	public static void closeConnection(Connection c) {
		try {
			if (c != null) {
				c.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			System.out.println(getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
