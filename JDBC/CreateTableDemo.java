package com.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateTableDemo {

	public static void main(String[] args) throws Exception 
	{	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vishwanath","root","vishwanath@7777");
		
		PreparedStatement ps = con.prepareStatement("create table if not exists newtable(name varchar(100),email varchar(100),password varchar(100),gender varchar(10),city varchar(10))");
		//create table with given fields and types but if it is not exists then it will show success but there will be no change in old table fields if you provided new fields 
		// IF NOT EXISTS condition check for a table if it is already present in database or not  
		int i = ps.executeUpdate();
		
		if(i==0) 
		{
			System.out.println("Success");
		}
		else 
		{
			System.out.println("Failed");
		}
	}
}