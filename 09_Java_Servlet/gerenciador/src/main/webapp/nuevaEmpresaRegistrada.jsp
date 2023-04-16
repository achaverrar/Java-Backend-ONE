<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nueva Empresa Registrada</title>
</head>
<body>
	<c:if test="${not empty empresa}">
	<p>La empresa ${empresa} fue registrada!</p>
	</c:if>
	<c:if test="${empty empresa}">
	<p>Ninguna empresa fue registrada!</p>
	</c:if>
</body>
</html>