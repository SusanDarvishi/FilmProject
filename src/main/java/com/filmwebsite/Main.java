package com.filmwebsite;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Main {
	public static void main(String[]args) throws Exception{
		getConnection();
		createTable();
		
	}
	public static void createTable()throws Exception{
		try{
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF DOESN'T EXIST tablename(id int NOT NULL AUTO_INCREMENT, first varchar(255), last varchar(255), PRIMARY KEY(id))");
			create.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		finally{System.out.println("Function Complete");}
	}
	public static Connection getConnection() throws Exception{
		
		try{
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/database";
			String username = "UID";
			String password = "Pwd";
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
			return conn;
		} catch(Exception e) {System.out.println(e);}
	
		return null;
	}
}
