package com.pSportPPE.pSportPPE;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLdbConnection {
	Connection conn = null;
	public static Connection ConnectDb() {
		
		try {
			 Class.forName("org.sqlite.JDBC");
	         Connection conn = DriverManager.getConnection("jdbc:sqlite:CFun.db");
	         System.out.println("Connection établie");
	         return conn;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
		
	}
}
