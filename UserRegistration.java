package com.fujitsu.loginandRegister.controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fujitsu.loginandRegister.DAO.UserRegistrationDAO;
import com.fujitsu.loginandRegister.model.User;

/**
 * Servlet implementation class UserRegistration
 */
@WebServlet("/userRegistration")
public class UserRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("Running User Registration Controller!!");

UserRegistrationDAO dao;

String userName= request.getParameter("username");
String password= request.getParameter("password");
String phoneNo= request.getParameter("phonenumber");
String address= request.getParameter("address");

Random random=new Random();
int userId= random.nextInt(999);

User newUser= new User(userId, phoneNo, userName, password, address);

dao =new UserRegistrationDAO();

	boolean result=dao.registerUser(newUser);


if(result)
	{System.out.println("User Register Successfully!");
response.sendRedirect("welcome.jsp");}

else
	System.out.println("Internal Error");
//dao.registerUser(newUser);


//System.out.println("UserId: "+userId+" "+"username: "+userName+" "+ "Phone Number: "+phoneNo+" "+"Address: "+address+" "+"Password: "+password+" ");
	
	
	
	}

}
