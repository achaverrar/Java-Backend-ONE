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
		<label>Login:</label>
		<input type="text" name="login" />
		</div>
		<div>		
		<label>Contraseña:</label>
		<input type="password" name="contrasena" />
		</div>
		<input type="hidden" name="accion" value="Login" />
		<input type="submit" value="Enviar">
	</form>
</body>
</html>