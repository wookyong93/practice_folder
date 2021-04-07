<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
	function fn_login(){
		var frm= document.login;
		var id = frm.id;
		var pwd = frm.pwd;
		if(id.value==""){
			alert('아이디를 입력해주세요');
			id.focus();
		}else if(pwd.value==""){
			alert('비밀번호를 입력해주세요');
			pwd.focus();
		}else{
			frm.method="post";
			frm.action="LoginCheck";
			frm.submit();
		}
	}
	</script>
</head>
<body>
	<form name="login">
		아이디 : <input type="text" name="id"/><br>
		비밀번호 : <input type="password" name="pwd"/><br>
		<br><br>
		<input type="button" value="login" onclick="fn_login()">
		<input type="button" value="cancel" onclick="location.href='blogMain.html'"/>
		<input type="button" value="sign up" onclick="location.href='join.jsp'"/>
	</form>
</body>
</html>