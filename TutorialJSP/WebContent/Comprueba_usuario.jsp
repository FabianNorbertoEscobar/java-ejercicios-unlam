<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Comprueba usuario</title>
</head>
<body>
	<%
		String usuario = request.getParameter("usuario");
		String contrasena = request.getParameter("contrasena");
		
		Class.forName("com.mysql.jdbc.Driver");
		java.sql.Connection connection = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_jsp", "root", "");
		String sql = "SELECT * FROM usuario where usuario = ? AND contrasena = ?";
		java.sql.PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, usuario);
		statement.setString(2, contrasena);
		java.sql.ResultSet rs = statement.executeQuery();
		
		if(rs.absolute(1)){
			out.println("usuario autorizado");
		}else{
			out.println("no hay usuario con esas credenciales");
		}
	%>
</body>
</html>