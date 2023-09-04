<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Recoge datos</title>
</head>
<body>
	<%
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String usuario = request.getParameter("usuario");
		String contrasena = request.getParameter("contrasena");
		String pais = request.getParameter("pais");
		String tecnologia = request.getParameter("tecnologias");
		
		Class.forName("com.mysql.jdbc.Driver");
		java.sql.Connection connection = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_jsp", "root", "");
		String sql = "INSERT INTO usuario(nombre, apellido, usuario, contrasena, pais, tecnologia) VALUES(?, ?, ?, ?, ?, ?)";
		java.sql.PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, nombre);
		statement.setString(2, apellido);
		statement.setString(3, usuario);
		statement.setString(4, contrasena);
		statement.setString(5, pais);
		statement.setString(6, tecnologia);
		statement.executeUpdate();
	%>
</body>
</html>