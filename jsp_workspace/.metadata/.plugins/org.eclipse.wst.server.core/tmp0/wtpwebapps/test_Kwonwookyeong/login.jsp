<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인창</title>
<script type="text/javascript">
	function fn_login(){
		var frm = document.frmLogin;
		var id = frm.id;
		var pwd = frm.pwd;
		if(id.value.length==0||id.value==""){
			alert('ID를 입력해주세요');
			id.focus();
		}else if(pwd.value.length==0 || pwd.value ==""){
			alert('PW를 입력해주세요');
			pwd.focus();
		}else{
			frm.submit();
		}
			
	}

</script>
</head>
<body>
	<form name = "frmLogin" style="text-align:center" action="loginChk.jsp" method="post">
	<h1>L O G I N</h1>
	<table align = "center">
		<tr>
			<th> I D : </th><td><input type="text" name="id"/></td>
		</tr>
		<tr>
			<th> P W : </th><td><input type="password" name="pwd"/></td>
		</tr>
	</table>
	<br> 
	<input type="button" value="로그인" onclick="fn_login()"/>
	<input type="button" value="종료" onclick = "window.close()"/>
	<input type="button" value="회원가입" onclick="location.href='memberForm.jsp'"/>
	</form>
</body>
</html>