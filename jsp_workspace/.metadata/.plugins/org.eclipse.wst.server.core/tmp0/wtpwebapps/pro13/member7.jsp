<%@page import="java.util.List"%>
<%@page import="sec01.ex01.MemberDAO"%>
<%@page import="sec01.ex01.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("UTF-8"); %>
    <jsp:useBean id="m" class="sec01.ex01.MemberBean" scope="page"/>
    
    <jsp:setProperty name="m" property="*"/>
    <%--memberBean의 입력하는내용이 모두 들어가있다면 *로 생략할수 있다 --%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록창</title>
</head>
<body>
<table align="center" width ="100%">
	<tr align="center" bgcolor="#99CCFF">
	<td width="7%">아이디</td>
	<td width="7%">비밀번호</td>
	<td width="5%">이름 </td>
	<td width="11%">이메일</td>
	</tr>
	<tr align="center">
		<td><jsp:getProperty name="m" property="id"/></td>
		<td><jsp:getProperty name="m" property="pwd"/></td>
		<td><jsp:getProperty name="m" property="name"/></td>
		<td><jsp:getProperty name="m" property="email"/></td>
		<%--저장한 액션 태그의 값을 호출 하여 출력한다. --%>
	</tr>
	<tr height ="1" bgcolor="#99CCFF">
			<td colspan="5"></td>
	</tr>
</table>
</body>
</html>