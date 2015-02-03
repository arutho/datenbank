package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connector {

	private static Connection connect = null;

	public static Connection connect() {
		try {
			System.out.println("lol");
			String url = "jdbc:oracle:thin:@localhost:1548:oracle";
			String acc = "joshi";
			String pw = "student";
			
			System.out.println("trolololo.");
			Class.forName("oracle.jdbc.OracleDriver");
			connect = DriverManager.getConnection(url,acc,pw);

			System.out.println("Connected.");
			connect.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return connect;

	}

}
