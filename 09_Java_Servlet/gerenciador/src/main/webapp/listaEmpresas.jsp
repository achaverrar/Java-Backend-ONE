<%@page import="com.alura.gerenciador.servlet.Empresa, java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Lista de empresas:</h1>
	<ul>
		<%
			List<Empresa> empresas = (List<Empresa>)request.getAttribute("empresas");
		for (Empresa empresa : empresas) {
		%>
		<li><%=empresa.getNombre()%></li>
		<%
		}
		%>
	</ul>
</body>
</html>