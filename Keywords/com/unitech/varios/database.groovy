package com.unitech.varios

import com.kms.katalon.core.annotation.Keyword

import internal.GlobalVariable

import java.sql.ResultSet
import java.sql.Statement
import java.sql.Connection
import java.sql.PreparedStatement
import java.sql.Driver
import java.sql.DriverManager




public class database {
	private static Connection connection = null;

	@Keyword
	def connectDB(String server, String port, String dbname, String username, String password) {
		String url = "jdbc:postgresql://"+server+":"+port+"/"+dbname+"?user="+username+"&password="+password +"&sslmode=disable"
		if(connection != null && !connection.isClosed()) {
			connection.close()
		}
		connection = DriverManager.getConnection(url)
		return connection
	}

	@Keyword
	def executeQuery(String queryString) {
		Statement stm = connection.createStatement()
		ResultSet rs = stm.executeQuery(queryString)

		return rs
	}

	@Keyword
	def closeDatabaseConnection() {
		if (connection != null && !connection.isClosed()) {
			connection.close()
		}
		connection = null
	}
}
