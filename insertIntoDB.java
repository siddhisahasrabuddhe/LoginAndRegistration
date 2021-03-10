package com.fujitsu.loginandRegister.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.fujitsu.loginandRegister.model.User;

public class insertIntoDB {
	public static User user;
	public boolean insertUser()
	{
	
	String url="jdbc:mysql://localhost:3306/test1";
	String db_username="root";
	String db_password="root";
	
	Connection con=null;
	PreparedStatement stmt;
	String sql="select * from user";
	
	insertIntoDB insert=new insertIntoDB();
	User user;
	ArrayList<User> al= new ArrayList<User>();
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con= DriverManager.getConnection(url, db_username, db_password);
		stmt=con.prepareStatement(sql);
		
		ResultSet result= stmt.executeQuery();
		
		while(result.next())
		{
			int id=result.getInt("id");
			String username=result.getString("username");
			String password=result.getString("password");
			String phoneNo=result.getString("phoneNo");
			String address=result.getString("address");
			
			System.out.print("ID: "+id);
			System.out.print("Username: "+username);
			System.out.print("Phone Number: "+phoneNo);
			System.out.print("Address: "+address);
			
			user=new User(result.getInt(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5));
		
			al.add(user);
			//request.setAttribute("userlist", al);
			//response.sendRedirect("admin.jsp");
		}
		result.close();		
				
	} catch (Exception e) {

		e.printStackTrace();
	}
	
if(con!=null)
	try {
		con.close();
	} catch (SQLException e) {

		e.printStackTrace();
	}
return false;
}
}