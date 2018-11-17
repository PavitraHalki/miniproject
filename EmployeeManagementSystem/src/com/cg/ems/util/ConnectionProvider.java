package com.cg.ems.util;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.cg.ems.exception.EMSException;



public class ConnectionProvider {

	private static Connection connection = null;
	
	public static Connection getConnection() throws EMSException {
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(new File(
					"res/db.properties")));
			String driver = properties.getProperty("db.driver");
			String url = properties.getProperty("db.url");
			String username = properties.getProperty("db.username");
			String password = properties.getProperty("db.password");

			try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				throw new EMSException("unable to load the class...");
			}
			try {
				connection = DriverManager.getConnection(url, username,
						password);
			} catch (SQLException e) {
				throw new EMSException("connection was not establised");
			}
		} catch (IOException e) {
			throw new EMSException(
					"unable to read the data from File, try again");
		}
		return connection;
	}

	public static void closeConnection() throws EMSException {
		try {
			connection.close();
		} catch (SQLException e) {
			throw new EMSException("unable close the connection");
		}
	}
}
