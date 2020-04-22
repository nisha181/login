<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html SYSTEM "about:legacy-compat">

<html lang="en">

<head>

<meta charset="utf-8">

<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">


<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<title>Login Page</title>
</head>
<body>
	<form:form method="post" modelAttribute="register">
		<table>
			<tr>
				<td colspan=2><center>
						<font size=4><b>Login Page</b></font>
					</center></td>
			</tr>

			<tr>
				<td>UserName:</td>
				<td><form:input path="userName" id="userName" /></td>
				<td><form:errors path="userName" /></td>
			</tr>

			<tr>
				<td>Password:</td>
				<td><form:input type="Password" path="password" id="password" /></td>
				<td><form:errors path="password" /></td>
			</tr>
			<tr>
				<td><input type="Reset"></td>
				<td><button class="btn btn-lg btn-primary"
						type="submit">Login</button></td>
			</tr>

		</table>
	</form:form>


</body>
</html>