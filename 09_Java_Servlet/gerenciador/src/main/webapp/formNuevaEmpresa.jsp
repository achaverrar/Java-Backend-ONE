<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/nuevaEmpresa" var="linkServletNuevaEmpresa" />
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<title>Registrar Empresa</title>
</head>
<body>
	<form action="/gerenciador/nuevaEmpresa" method="post">
		<label>Nombre empresa:</label>
		<input type="text" name="nombre" />
		<input type="submit" value="Enviar">
	</form>
</body>
</html>