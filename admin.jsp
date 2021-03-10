<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html>
<html>

<body>
<%
if(session.getAttribute("user")==null)
{
	response.sendRedirect("Login.jsp");
}

%>
<h2>This is Admin Module</h2>

<h3>User Profile</h3>


<form action="UserController" method="post">


</body>
</html>