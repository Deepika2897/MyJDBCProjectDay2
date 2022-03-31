package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//connection
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/deepika";//deepika is a database name
		String un="root";
		String pass="root";
	    Connection conn=null;
	    Statement st=null;
	    ResultSet rs=null;
	    try
	    {
	    	Class.forName(driver);
	    	conn=DriverManager.getConnection(url, un,pass);
	    	st=conn.createStatement();
	    	String sql="Select *from login";
	    	rs=st.executeQuery(sql);                    //sample table (column)values specifying
	    	System.out.println("username \tuserpassword");//Sysout("name\temail\tpass\tage");
	    	while(rs.next())                       //String n=rs.getString("sname");//or(1)
	    	{                                      //String e=rs.getString("semail");//or(2)
	    	String username=rs.getString(1);       //String p=rs.getString("spass");//or(3)
	    	String userpassword=rs.getString(2);   //int a=rs.getInt("age");//or(4)
	    	System.out.println(username+"\t\t"+userpassword);//Sysout(n+\t\t"+e"\t\t"+p+"\t"+a);
	    	}
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }

	}

}
