<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method='GET' action='../controller/editRecord'>
		<h1 style='color: brown;text-align:center'>Student details</h1>
		<table align="center">
			<tr>
				<td>ID:</td>
				<td>${updateFormRes.id}</td>
				<input type='hidden' name='id' value='${updateFormRes.id}' />
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type='text' name='name' value='${updateFormRes.name}' /></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><input type='text' name='age' value='${updateFormRes.age}' /></td>
			</tr>
			<tr>
				<td>City:</td>
				<td><input type='text' name='city' value='${updateFormRes.city}' /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type='submit' value='update' /></td>
			</tr>
		</table>
	</form>
</body>
</html>