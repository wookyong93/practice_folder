<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%--포스트로 전송할 경우 request.setCharacterEncoding("utf-8")입려해 주어야 한글이 전달된다. --%>
    <%
    	String id =request.getParameter("id");
    	String pw =request.getParameter("pw");
    	String name = request.getParameter("name");
    	int age = Integer.parseInt(request.getParameter("age"));
    	String email=request.getParameter("email"); 
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 창</title>
</head>
<body>
<table>
	<tr><th>회원정보창</th></tr>
	<tr><td>ID :</td><td> <%=id %> </td>
	<tr><td>PW :</td><td> <%=pw %> </td>
	<tr><td>이름 :</td><td> <%=name %> </td>
	<tr><td>나이 :</td><td> <%=age %> </td>
	<tr><td>이메일 :</td><td> <%=email %> </td>
</table>

</body>
</html>