<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/entrada" var="linkEntradaServlet" />

<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<title>Registrar Empresa</title>
</head>
<body>
	<form action="${ linkEntradaServlet }" method="post">
		<div>
			<label>Nombre empresa:</label>
			<input type="text" name="nombre" value="${ empresa.nombre }" />
		</div>
		<div>
			<label>Fecha de apertura:</label>
			<input type="text" name="fecha" value="<fmt:formatDate value="${empresa.fechaApertura}" pattern="dd/MM/yyyy"/>" />
		</div>
		<input type="hidden" name="id" value="${empresa.id }" />
		<input type="hidden" name="accion" value="ModificarEmpresa" />
		<input type="submit" value="Enviar">
	</form>
</body>
</html>