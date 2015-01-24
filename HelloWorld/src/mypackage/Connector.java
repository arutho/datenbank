package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connector {


	private static Connection connect = null;
	private Statement statement = null;
	private ResultSet resultset = null;

	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://sql3.freemysqlhosting.net:3306/sql364370";
			String acc = "sql364370";
			String pw = "vD5!dE1%";
			
			System.out.println("trolololo.");
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(url,acc,pw);

			System.out.println("Connected.");
			connect.close();

		} catch (Exception e) {
			System.out.println("Fail.");
		}

	}

}
