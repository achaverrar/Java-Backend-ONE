<%@page import="com.alura.gerenciador.servlet.Empresa, java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<title>Lista de Empresas</title>
</head>
<body>
	<h1>Lista de empresas:</h1>
	<ul>
		<c:forEach items="${empresas}" var="empresa">
			<li>${empresa.nombre} - <fmt:formatDate value="${empresa.fechaApertura}" pattern="dd/MM/yyyy"/></li>
		</c:forEach>
	</ul>
</body>
</html>