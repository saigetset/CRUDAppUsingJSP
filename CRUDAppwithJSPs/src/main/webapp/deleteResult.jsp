<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored='false'%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix='c' %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>InsertResult</title>
</head>
<body>
	<c:choose>
		<c:when test="{deleteRes eq 'successful'}">
			<h1 style='color:brown; text-align:center'>Deletion Successful</h1>
		</c:when>
		<c:otherwise>
			<h1 style='color:brown; text-align:center'>Deletion Failed</h1>			
		</c:otherwise>
	</c:choose>
</body>
</html>