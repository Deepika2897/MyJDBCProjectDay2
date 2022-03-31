package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecordByUser {

	public static void main(String[] args) {
	//connection
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/deepika";//deepika is a database name
		String un="root";
		String pass="root";
	    Connection conn=null;
	    Statement st=null;
	    String username;
	    String userpassword;
	    Scanner sc=new Scanner(System.in);
		try {
			Class.forName(driver);//load the driver,here class is the name of final class
			conn=DriverManager.getConnection(url,un,pass);
			st=conn.createStatement();
			//from here
			while(true)
			{
			System.out.println("Enter the username");
			username=sc.next();
			System.out.println("Enter the userpassword");
			userpassword=sc.next();
			String ins="insert into login values('"+userpassword+"','"+username+"')";
			int i=st.executeUpdate(driver);
			if(i>0)
			{
				System.out.println("Record is inserted successfully");
			}
			else
			{
				System.out.println("Not inserted");
		}
			System.out.println("Do you want to continue y/n");
			char ch=sc.next().charAt(0);
			if(ch=='n')
			{
				break;
			}
			}}
	
			/*or
			if(ch.equalsIgnoreCase("no"\))
					{
				
					}
			}*/
		
	catch(Exception e)
	{
		e.printStackTrace();
	}
		System.out.println("End of the program");
					
			
}			
}