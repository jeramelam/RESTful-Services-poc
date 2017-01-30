package org.endpoint.theone.myendpoint.dao;

import java.sql.*;

import org.endpoint.theone.myendpoint.exception.DatabaseErrorException;

public class DBConnection {
	public static Connection getConnection(){
		String url = "jdbc:mysql://localhost:3306/";
		String user = "root";
		String password = "";
		Connection con = null;
		try
		{
		    Class.forName("com.mysql.jdbc.Driver").newInstance();
		    con = DriverManager.getConnection(url, user, password);
		}
		catch (Exception e)
		{
		    throw new DatabaseErrorException("Cannot connect to DB.");
		}
		return con;
	}
}
