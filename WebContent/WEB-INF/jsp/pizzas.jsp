<%@page contentType='text/html' pageEncoding='utf-8' session='false' trimDirectiveWhitespaces='true' %>
<%@taglib prefix='core' uri='http://java.sun.com/jsp/jstl/core'  %>
<!DOCTYPE html>
<html lang='nl'>
<head>
	
	<link rel='stylesheet' href='styles/default.css' />
	<link rel='shortcut icon' href="images/favicon.ico" type="image/x-icon" />
	<meta name='viewport' content='width=device-width, initial-scale=1' >
	<title>Pizza 's</title>
</head>
<body>
	<div class='container'>
	
		<header>
		
			<h1>Pizza's</h1>
			<img src='images/pizza.jpg' alt='Pizza' class='fullwidth'>
			
			<ul class='zebra'>
				<core:forEach var='entry' items="${pizzas}">
					<li>
						${entry.key}: <core:out value= '${entry.value.naam}'/> - ${entry.value.prijs}euro
						<core:if test='${entry.value.pikant}'> (pikant)</core:if>
						<core:url value='/pizzas/detail.htm' var="detailURL" >
							<core:param name='id' value='${entry.key}' />
						</core:url>
						<a href='${detailURL}'>Detail</a>
					</li>
				</core:forEach>
			</ul>	
		</header>
	</div>
</body>

</html>