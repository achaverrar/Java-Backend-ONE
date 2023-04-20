<%@page import="com.alura.gerenciador.modelo.Empresa, java.util.List"%>
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
	<c:import url="logoutParcial.jsp"></c:import>
	<h1>Usuario Loggeado: ${ loginUsuario.login }</h1>
	<h2>Lista de empresas:</h2>
	<ul>
		<c:forEach items="${empresas}" var="empresa">
			<li>${empresa.nombre} - <fmt:formatDate value="${empresa.fechaApertura}" pattern="dd/MM/yyyy"/>
			<a href="/gerenciador/entrada?accion=MostrarEmpresa&id=${empresa.id}">modificar</a>
			<a href="/gerenciador/entrada?accion=EliminarEmpresa&id=${empresa.id}">eliminar</a>
			</li>
		</c:forEach>
	</ul>
</body>
</html>