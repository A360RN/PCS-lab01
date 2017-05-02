package com.a360rn.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DBAccess {

	private static Connection _connection = null;

	public static Connection getConnection() {
		try {
			if (_connection == null || _connection.isClosed()) {
				DriverManager.registerDriver(new Driver());
				_connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?useSSL=false", "root",
						"los800815");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return _connection;
	}

}
