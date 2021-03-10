package com.fujitsu.loginandRegister.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.fujitsu.loginandRegister.model.User;

public class UserRegistrationDAO {
	
	public boolean registerUser(User user) 
	{
		System.out.println("Start of UserRegistrationDAO :: registerUser");
		
		String url="jdbc:mysql://localhost:3306/test1";
		String db_username="root";
		String db_password="root";
		
		Connection con;
		PreparedStatement stmt;
		
		String sql="insert into user values(?,?,?,?,?)";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection(url, db_username, db_password);
		stmt=con.prepareStatement(sql);
		
		stmt.setInt(1, user.getId());
		stmt.setString(2, user.getUsername());
		stmt.setString(3, user.getPassword());
		stmt.setString(4, user.getPhoneNo());
		stmt.setString(5, user.getAddress());
		
		int result= stmt.executeUpdate();
		
		if(result>0)
		
			return true;
		
		
		} catch (Exception e) {

			e.printStackTrace();
		}
		System.out.println("Start of UserRegistrationDAO :: registerUser");
		return false;
		
	}

}
