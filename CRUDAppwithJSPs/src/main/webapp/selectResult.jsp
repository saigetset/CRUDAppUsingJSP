<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored='false'%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix='c' %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>selectResult</title>
</head>
<body>
	<c:choose>
		<c:when test="${result ne null || ! empty result }">
		<h1 style='color:brown; text-align:center'>Requested Student details</h1>
			<table align="center" border='1'>
				<tr>
					<th>ID</th><th>Name</th><th>Age</th><th>City</th>
				</tr>
				<tr>
					<td>${result.id}</td>
					<td>${result.name}</td>
					<td>${result.age}</td>
					<td>${result.city}</td>
				</tr>
			</table>
		</c:when>
		<c:otherwise>
			<h1 style='color:brown; text-align:center'>Student not found!</h1>
		</c:otherwise>
	</c:choose>
</body>
</html>