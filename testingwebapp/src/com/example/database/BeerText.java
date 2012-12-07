package com.example.database;

//STEP 1. Import required packages
import java.sql.*;
import javax.sql.*;
import java.util.*;
import java.io.*;

public class BeerText {
	static private String text101="No data";
	static private String text102="No data";
	static private String text103="No data";
	static private String text104="No data";
	
	// JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/beerdb";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "evansd";
	   	
	   public BeerText()
	   {
	   	InitParam();
	   }
	   	
	   	
	public void InitParam() {
		Connection conn = null;
		Statement stmt = null;
		try{
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(DB_URL,USER,PASS);
		stmt = conn.createStatement();
	      String sql;
	      sql = "SELECT * FROM BeerText";
	      ResultSet rs = stmt.executeQuery(sql);
	     
	      //STEP 5: Extract data from result set
	      while(rs.next()){
		 //Retrieve by column name
		 if(rs.getInt("textId") == 101)
		 this.text101  = rs.getString("text");
		 
		 if(rs.getInt("textId") == 102)
		 this.text102  = rs.getString("text");
		 //text102  = rs.getString("text");
		 
		 if(rs.getInt("textId") == 103)
		 this.text103  = rs.getString("text");
		 //text103  = rs.getString("text");
		 
		 if(rs.getInt("textId") == 104)
		 this.text104  = rs.getString("text");
		 //text104  = rs.getString("text");		 
	      }
	      //STEP 6: Clean-up environment
	      rs.close();
	      stmt.close();
	      conn.close();
	   }catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }finally{
	      //finally block used to close resources
	      try{
		 if(stmt!=null)
		    stmt.close();
	      }catch(SQLException se2){
	      }// nothing we can do
	      try{
		 if(conn!=null)
		    conn.close();
	      }catch(SQLException se){
		 se.printStackTrace();
	      }//end finally try
	   }//end try
	   //System.out.println("Goodbye!");
	}//end InitParam
	
	public String getText1()
 	{
 		//InitParam();
 		return text101;
 	}
 	
 	public String getText2()
 	{
 		//InitParam();
 		return text102;
 	}
 	
 	public String getText3()
 	{
 		//InitParam();
 		return text103;
 	}
 	
 	public String getText4()
 	{
 		//InitParam();
 		return text104;
 	}
 

}
