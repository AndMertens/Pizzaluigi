<%@page contentType='text/html' pageEncoding='utf-8' session='false' trimDirectiveWhitespaces='true' %>
<%@taglib prefix='core' uri='http://java.sun.com/jsp/jstl/core'  %>
<!DOCTYPE html>
<html lang='nl'>
<head>
	<link rel='stylesheet' href='styles/default.css' />
	<link rel='shortcut icon' href="images/favicon.ico" type="image/x-icon" />
	<meta name='viewport' content='width=device-width, initial-scale=1' >
	<title>Pizza Luigi</title>
</head>
<body>
	<nav><ul>
			<li><a href="<core:url value='/'/>">Welkom</a></li>
			<li><a href="<core:url value='/pizzas.htm'/>">Pizza's</a></li>
			<li><a href="<core:url value='/statistiek.htm'/>">Statistiek</a></li>
			<li><a href="<core:url value='/pizzas/tussenprijzen.htm'/>">Pizza's tussen prijzen</a></li>
			<li><a href="<core:url value='/voorkeuren.htm'/>">Voorkeurpizza's</a></li>
			<li><a href="<core:url value='/pizzas/toevoegen'/>">Pizza toeveogen</a></li>
			<li><a href="<core:url value='/cookies.htm' />">Cookies</a></li>
			<li><a href="<core:url value='/headers.htm' />">Headers</a></li>
			<li><a href="<core:url value='/pizzas/bestellen.htm'/>">Bestellen</a></li>
	</ul></nav>
</body>
</html>