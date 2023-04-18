<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/nuevaEmpresa" var="linkServletNuevaEmpresa" />
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<title>Registrar Empresa</title>
</head>
<body>
	<form action="/gerenciador/modificarEmpresa" method="post">
		<div>
			<label>Nombre empresa:</label> <input type="text" name="nombre"
				value="${ empresa.nombre }" />
		</div>
		<label>Fecha de apertura:</label> <input type="text" name="fecha"
			value="<fmt:formatDate value="${empresa.fechaApertura}" pattern="dd/MM/yyyy"/>" />
		<input type="hidden" name="id" value="${empresa.id }" />
		<div></div>
		<input type="submit" value="Enviar">
	</form>
</body>
</html>