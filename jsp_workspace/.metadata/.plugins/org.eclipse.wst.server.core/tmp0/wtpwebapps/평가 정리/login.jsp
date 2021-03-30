<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table{
		text-align:center;
		margin : auto;
	}
</style>
<script>
	function inputCheck(){
		var frm = document.frm;
		var id = frm.id.value;
		var pwd = frm.pwd.value;
		
		if(id == ""){
			alert('아이디를 입력하세요');
			frm.id.focus();
		}else if(pwd==""){
			alert('암호를 입력하세요');
			frm.pwd.focus();
		}else{
			frm.method="post";
			frm.action="loginCheck.jsp";
			frm.submit();
		}
		
	}

</script>
</head>
<body>
	<form name="frm">
		<table>
			<tr> 
				<th colspan="2">로그인</th>
			</tr>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pwd"></td>
			</tr>
			<tr>
				<td colspan ="2"><input type="button" value="로그인" onclick="inputCheck()">
				<input type="reset" value="다시입력"/></td>
		</table>
	</form>
</body>
</html>