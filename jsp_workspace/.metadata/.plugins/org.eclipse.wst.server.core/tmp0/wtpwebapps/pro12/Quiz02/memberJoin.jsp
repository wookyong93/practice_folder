<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
     import="java.util.*"
    import="Quiz.q01.*"
    %>
<!DOCTYPE html>
<html>
<head>
<script>
function pwchk(){
	var frm=document.frmJoin;
	var id = frm.id.value;
	var pw = frm.pw.value;
	var pwchk=frm.pwchk.value;
	if(pw!=pwchk){
		alert('비밀번호는 필수입니다.');
		pw="";
		pwchk="";
		pw.focus();
	}else{
		document.frmJoin.action="join.jsp"
	}
}
</script>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
</head>
<body>
<form name="frmJoin" method="post">
<table>
	<tr><td align='center'><h1>회원가입</h1></td>
	<tr><th align='center'>ID</th><td><input type="text"name="id"/></td></tr>
	<tr><th align='center'>PW</th><td><input type="password"name="pw"/></td></tr>
	<tr><th align='center'>PW확인</th><td><input type="password"name="pwchk"/></td></tr>
	<tr><th align='center'>이름</th><td><input type="text"name="name"/></td></tr>
	<tr><th align='center'>email</th><td><input type="text"name="email"/></td></tr>
</table>
<br>
<input type="submit" value="회원가입" onclick="pwchk()"/>
<input type="reset" value="초기화"/>
</form>
</body>
</html>