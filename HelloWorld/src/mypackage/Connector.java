package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Connector {
	
	private static Connection connect = null;
	private  Statement statement = null;
	private ResultSet resultset = null;
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net" + "user=sql364370&password=vD5!dE1%");
			System.out.println("Connected.");
		
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
	}

}
