<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="linkEntradaServlet" />
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<title>Registrar Empresa</title>
</head>
<body>
	<form action="${linkEntradaServlet}" method="post">
		<div>
		<label>Nombre empresa:</label>
		<input type="text" name="nombre" />
		</div>
		<div>		
		<label>Fecha de apertura:</label>
		<input type="text" name="fecha" />
		</div>
		<input type="hidden" name="accion" value="NuevaEmpresa" />
		<input type="submit" value="Enviar">
	</form>
</body>
</html>