<%@page import="javax.swing.text.Document"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import ="java.util.*,ex01.*"
    isELIgnored="false"
    %>
    <% 
    request.setCharacterEncoding("UTF-8");
    String id_ = request.getParameter("id_");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
<script>
	window.onload=function (){
		
		if(!<%=id_%>!=null){
			var user_id = document.querySelector("#user_id").value=<%=id_%>;
		}
		
		
	}
	function fn_chk(){
		var id = document.querySelector("#user_id").value;
		console.log(id);
		 location.href="idChk.jsp?user_id="+id;
		
	}
	function join(){
		var frm = document.frmJoin;
		var id =frm.id.value;
		var pwd =frm.pwd;
		var pwdchk=frm.pwdChk;
		var name=frm.name.value;
		var email=frm.email.value;
		if(id.length == 0 || id ==""){
			alert('아이디를 입력해주세요');
		}else if(pwd.value.length == 0 || pwd.value ==""){
			alert('비밀번호를 입력해주세요');
		}else if(pwd.value != pwdchk.value){
			alert('비밀번호가 다릅니다.');
			pwd.value= "";
			pwdchk.value= "";
			frm.pwd.focus();
		}else if(name.length == 0 || name ==""){
			alert('이름을 입력해주세요');
		}else if(email.length == 0 || email ==""){
			alert('이메일을 입력해주세요');
		}else{
			
			frm.method="post";
			frm.submit();
		}
	}
	
</script>
</head>
<body>
<form name="frmJoin" action="memberJoin.jsp"style="text-align:center">
	<h1> 회 원 가 입</h1>
	<table align="center">
	<tr>
		<th>I  D</th>
		<td><input type="text" name="id" id="user_id" /></td>
		<td><input type="button" value="중복확인" onclick="fn_chk()"/>
	</tr>
	<tr>
	<th>P  W</th>
		<td><input type="password" name="pwd"/></td>
	</tr>
	<tr>
		<th>PW확인</th>
		<td><input type="password" name="pwdChk"/></td>
	</tr>
	<tr>
	<th>이 름</th>
	<td><input type="text" name="name"/></td>
	</tr>
	<tr>
	<th>E-mail</th>
	<td><input type="email" name="email"/></td>
	</tr>
	<tr>
	</tr>
	<tr>
	</table>
	<br>
	<input type="button" value="가  입" onclick ="join()"/> 
	<input type="button" value="취  소" onclick="location.href='login.jsp'"/>
	 
</form>
</body>
</html>