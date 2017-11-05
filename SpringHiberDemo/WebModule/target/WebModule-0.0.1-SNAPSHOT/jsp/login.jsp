<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<spring:url value="/resources/js/vendor/angular.min.js" var="angularJs" />
<spring:url value="/resources/js/app.js" var="appJs" />
<title>Login page</title>
</head>
<body ng-app="app">
	<form:form modelAttribute="loginBean" action="loginSubmit">
		<table align="center" border="1">
			<tr>
				<td>User ID:</td>
				<td><input type="text" size="20" name="userId"></input></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" size="20" name="password"></input></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"></td>
			</tr>
		</table>
	</form:form>
	<script type="text/javascript" src="${angularJs}"></script>
	<script type="text/javascript" src="${appJs}"></script>
</body>
</html>