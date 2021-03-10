package com.fujitsu.loginandRegister.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fujitsu.loginandRegister.DAO.insertIntoDB;
import com.fujitsu.loginandRegister.model.User;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		insertIntoDB insert=new insertIntoDB();
		User user;
		ArrayList<User> al= new ArrayList<User>();
		
		al.add(insertIntoDB.user);
		request.setAttribute("userlist", al);
		response.sendRedirect("admin.jsp");
		
	
}
}