<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro</title>
</head>
<body>
	<h2>Usuarios registrados</h2>
	Usuario confirmado<br/><br/>>
	Nombre:<%=request.getParameter("nombre") %>&nbsp; Apellido:<%=request.getParameter("apellido") %>
</body>
</html>