package com.pSportPPE.pSportPPE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SQLdb {
	public static void main( String args[] ) {
	      Connection conn = null;
	      Statement stmt = null;
	      
	      try {
	         Class.forName("org.sqlite.JDBC");
	         conn = DriverManager.getConnection("jdbc:sqlite:CFun.db");
	         System.out.println("Opened database successfully");

	         stmt = conn.createStatement();
	         String sql = "CREATE TABLE USERS" +
	        		  "(USER_ID INT PRIMARY KEY NOT NULL, "  +
	        		  "USERNAME CHAR NOT NULL, " +
	        		  "PASSWORD CHAR NOT NULL, " +
	        		  "EMAIL 	CHAR NOT NULL, " +
	        		  "TYPE 	CHAR NOT NULL) ";
	        		 
	         stmt.executeUpdate(sql);
	         stmt.close();
	         conn.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Table created successfully");
	   }
}
