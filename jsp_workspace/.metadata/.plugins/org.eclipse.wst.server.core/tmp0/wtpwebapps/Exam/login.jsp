<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 창</title>
</head>
<body>
<form method = "post" action="loginChk.jsp" style="text-align:center">
<h1>Login</h1>
<table align="center">
	<tr>
		<th>ID : </th>
		<td><input type="text" name="user_id"/></td>
	</tr>
	<tr>
		<th>PW : </th>
		<td><input type="password" name="user_pw"/></td>
	</tr>
</table>
<br><br>
<input type="submit" value="로그인"/> <input type="button" value="종료" onclick="window.close()"/>
<input type="button" value="회원가입" onclick="location.href='memberForm.jsp'"/>
</form>

</body>
</html>