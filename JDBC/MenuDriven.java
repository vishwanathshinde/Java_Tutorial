package com.jdbc.example;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.Connection;

public class MenuDriven {

	public static void main(String[] args) throws Exception
	{
		int ch;
		int i;
		String name1, email1, pass1, gender1, city1, sqlQuery = " ";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vishwanath","root","vishwanath@7777");
		
		PreparedStatement ps = con.prepareStatement(sqlQuery);
		
		//PreparedStatement ps = con.prepareStatement("create table if not exists newtable(name varchar(100),email varchar(100),password varchar(100),gender varchar(10),city varchar(10))");

		
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("");
			System.out.println("1. Insert");
			System.out.println("2. Update");
			System.out.println("3. Delete");
			System.out.println("4. Search");
			System.out.println("5. Display");
			System.out.println("6. Exit");
			System.out.print("\nEnter Your Choice : ");
			
			ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:
					System.out.println("Enter student name : ");
					name1 = sc.next();
					System.out.println("Enter student email : ");
					email1 = sc.next();
					System.out.println("Enter student pass : ");
					pass1 = sc.next();
					System.out.println("Enter student gender : ");
					gender1 = sc.next();
					System.out.println("Enter student city : ");
					city1 = sc.next();
					
					sqlQuery = "insert into register values('"+name1+"','"+email1+"','"+pass1+"','"+gender1+"','"+city1+"')";
					
					i = ps.executeUpdate(sqlQuery);
					
					if(i>0) {
						System.out.println("Inserted successfully");
					}
					else {
						System.out.println("Failed");
					}
					break;
				case 2:
					System.out.println("Enter student name same as db to update: ");
					name1 = sc.next();
					System.out.println("Enter new email : ");
					email1 = sc.next();
					System.out.println("Enter new password : ");
					pass1 = sc.next();
					System.out.println("Enter new gender : ");
					gender1 = sc.next();
					System.out.println("Enter new city : ");
					city1 = sc.next();
					
					sqlQuery = "update register set email = '"+email1+"' , password = '"+pass1+"' , gender = '"+gender1+"' , city = '"+city1+"' where name = '"+name1+"'";
					
					i  = ps.executeUpdate(sqlQuery);
					
					if(i>0) {
						System.out.println("Updated successfully");
					}
					else {
						System.out.println("Failed");
					}
					break;
				case 3:
					System.out.println("Enter student name same as db to delete: ");
					name1 = sc.next();
					
					sqlQuery = "delete from register where name = '"+name1+"'";

					i  = ps.executeUpdate(sqlQuery);
					
					if(i>0) {
						System.out.println("Deleted successfully");
					}
					else {
						System.out.println("Failed");
					}
					break;
				case 4:
					System.out.println("Enter student name same as db to search details: ");
					name1 = sc.next();
					
					sqlQuery = "select * from register where name = '"+name1+"'";

					ResultSet rs = ps.executeQuery(sqlQuery);
					
					while(rs.next())
					{
						System.out.println("Name: " + rs.getString("name"));
						
						System.out.println("Email: " + rs.getString("email"));
						
						System.out.println("Password: " + rs.getString("password"));
						
						System.out.println("Gender: " + rs.getString("gender"));
						
						System.out.println("City: " + rs.getString("city"));
					}
					break;
				case 5:					
					sqlQuery = "select * from register";

					ResultSet rs1 = ps.executeQuery(sqlQuery);
					
					while(rs1.next())
					{
						System.out.println("Name: " + rs1.getString("name"));
						
						System.out.println("Email: " + rs1.getString("email"));
						
						System.out.println("Password: " + rs1.getString("password"));
						
						System.out.println("Gender: " + rs1.getString("gender"));
						
						System.out.println("City: " + rs1.getString("city"));
						
						System.out.println("----------------------------------");
					}
					break;
				case 6:
					System.out.println("\npressed EXIT");
					break;
			}
		}
		while(ch != 6);
		sc.close();
	}
}
