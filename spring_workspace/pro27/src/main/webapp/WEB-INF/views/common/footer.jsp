<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%
    	request.setCharacterEncoding("UTF-8");
    %>
    <c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>푸터</title>
<style>
	p{
		font-size: 20px; 
		text-align: center;
	}
</style>
</head>
<body>
	<p>email : admin@test.com</p><br>
	<p>회사주소 : 경기도 구리시</p><br>
	<p>찾아오는길 : <a href="#">약도</a></p>
</body>
</html>