package design.patterns.structural.bridge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BridgeUsage {

	public static void main(String args[]) {

        // JDBC is the interface, Drivers implement that interface,
        // client work with those drivers w/o knowing any underlying details
        // JDBC interface is not coupled to any implementation, Driver is the bridge

		try {
			//JDBC is an API
			DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver()); // <- Driver

			String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";

			Connection conn = DriverManager.getConnection(dbUrl);

			Statement sta = conn.createStatement(); 
			
			// This client (BridgeUsage code) can work with any database that has a driver
            // we can use the same sql with different database
			sta.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20),"
							+ " City VARCHAR(20))");
			
			System.out.println("Table created");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
