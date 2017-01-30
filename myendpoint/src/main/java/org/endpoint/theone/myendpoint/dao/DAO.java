package org.endpoint.theone.myendpoint.dao;

import java.sql.*;

import org.endpoint.theone.myendpoint.exception.DatabaseErrorException;

public class DAO {
	public static void preload() {
		try
		{
			Connection con = DBConnection.getConnection();
		    Statement st = con.createStatement();  
		    st.execute("CREATE DATABASE IF NOT EXISTS theone");
		    st.execute("USE theone");
		    st.execute("DROP TABLE IF EXISTS theone");
		    st.execute("CREATE TABLE theone (" +
		            "id BIGINT NOT NULL AUTO_INCREMENT,"
		            + "number BIGINT,"
		            + "PRIMARY KEY(id)"
		            + ")");
		    st.execute("INSERT INTO theone (number) VALUES (5)");
		    System.out.println("record inserted");
		    st.close();
		    con.close();            
		}
		catch (Exception e)
		{
			throw new DatabaseErrorException("Cannot connect to DB.");
		}
	}
	public static int retrieveNumber() {
		int num = 0;
		try
		{
			Connection con = DBConnection.getConnection();
			Statement st = con.createStatement();
			st.execute("USE theone");
			PreparedStatement ps = con.prepareStatement("SELECT number FROM theone");
		    ResultSet res = ps.executeQuery();
		    while (res.next())
		    {
		    	num = res.getInt("number");
		    	System.out.println("Number in DB is "+num);
		    }
		    res.close();
		    ps.close();
		    st.close();
		    con.close();            
		}
		catch (Exception e)
		{
		    e.printStackTrace();
		}
		return num;
	}
}
