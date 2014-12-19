<%@page contentType='text/html' pageEncoding='utf-8' session='false' trimDirectiveWhitespaces='true' %>
<%@taglib prefix='core' uri='http://java.sun.com/jsp/jstl/core'  %>
<!DOCTYPE html>
<html lang='nl'>
<head>
	<core:import url="/WEB-INF/jsp/head.jsp" >
		<core:param name='title' value='Pizza Luigi' />
	</core:import>
</head>
<body>
		<core:import url="/WEB-INF/jsp/menu.jsp" />
</body>
</html>