<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Saludo</title>
</head>
<body>
	<h1>Saludos</h1>
	Hola Mundo! La fecha del sistema es: <%= new java.util.Date() %>
	<%for (int i = 0; i < 10; i++) {
		System.out.println("Este es el mensaje " + i);
	}%>
	<%!private int suma; public double promedio; %>
	<%= request.getHeader("User-Agent") %>
	<%= request.getLocale() %>
</body>
</html>