package com.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {

	public static void main(String[] args) throws Exception {
		String city1 = "USA";
		String email1 = "vishwa@123";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vishwanath","root","vishwanath@7777");
		PreparedStatement ps = con.prepareStatement("update register set city=? where email=?");
		ps.setString(1, city1);
		ps.setString(2, email1);

		int i = ps.executeUpdate();
		
		if(i>0) 
		{
			System.out.println("Success");
		}
		else 
		{
			System.out.println("Failed");
		}
		System.out.println("Hello");
	}

}
