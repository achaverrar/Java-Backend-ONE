<%
	// This is a scriptlet
	String empresa = "Alura";
	System.out.println(empresa);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nueva Empresa Registrada</title>
</head>
<body>
<p>La empresa <% out.println(empresa); %> fue registrada!</p>
<% // A shorcut below %>
<p>La empresa <%= empresa %> fue registrada!</p>
</body>
</html>