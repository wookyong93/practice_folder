<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<form name="frmLogin" method="post" action="loginChk">
		<table align="center">
			<tr>
				<th colspan="2"><h1>L O G I N</h1></th>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<th>I D </th>
				<td><input type="text" name="id"/></td>
			</tr>
			<tr>
				<th>P W </th>
				<td><input type="password" name="pwd"></td>
			</tr>
			<tr>
			<td>&nbsp;</td>
			</tr>
			<tr align="center">
				<td colspan="2"> <input type="submit" value="Login" > <input type="button" value="signup"/>
				</td>
			</tr>
			
		</table>
	</form>
</body>
</html>