package com.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {

	public static void main(String[] args) throws Exception 
	{
		String name1 = "Shivgami";
		String email1 = "shivgami@123";
		String pass1 = "shivgami123";
		String gender1 = "female";
		String city1 = "Mahishmati";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vishwanath","root","vishwanath@7777");
		
		//PreparedStatement ps = con.prepareStatement("insert into register values('deepak','deepak@gmail.com','deepak123','male','Pune')");
		
		//PreparedStatement ps = con.prepareStatement("insert into register values('"+name1+"','"+email1+"','"+pass1+"','"+gender1+"','"+city1+"')");

		PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?)");
		
		ps.setString(1, name1);
		ps.setString(2, email1);
		ps.setString(3, pass1);
		ps.setString(4, gender1);
		ps.setString(5, city1);
		
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
