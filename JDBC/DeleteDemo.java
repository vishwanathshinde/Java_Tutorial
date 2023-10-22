package com.jdbc.example;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public class DeleteDemo {

	public static void main(String[] args)throws Exception
	{
		String email1 = "deepak@gmail.com";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vishwanath","root","vishwanath@7777");
		PreparedStatement ps = con.prepareStatement("delete from register where email=?");
		ps.setString(1, email1);
		
		int i = ps.executeUpdate();
		
		if(i>0)
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("Failed");
		}
	}
}