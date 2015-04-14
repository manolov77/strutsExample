<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/tags/struts-bean" prefix="bean"%>
<html>
<head>
<title>User Registration Was Successful!</title>
</head>
<body>
	<h1>User Registration Was Successful!</h1>
	<table>
		<tr>
			<td> <bean:message key="userRegistration.firstName"/> </td>
			<td> <bean:write  name="user" property="firstName"/> </td>
		</tr>
	
	</table>
</body>
</html>