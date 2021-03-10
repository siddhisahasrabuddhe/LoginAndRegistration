<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome page</title>
</head>
<body>

<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");

if(session.getAttribute("user")==null)
{
	response.sendRedirect("Login.jsp");
}

%>


<h2>Welcome  ${user }</h2><br>
<div class="container" >
<a href="welcome.jsp">Home</a>
<a href="AboutUs.jsp">About Us</a>
<a href="admin.jsp">Admin</a>


</div>
<br>
<form action="Logout">
<input type="submit" value="logout">
</form>
</body>
</html>