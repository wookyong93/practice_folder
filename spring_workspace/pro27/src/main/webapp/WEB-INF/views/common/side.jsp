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
<style>
	.no_underline{
		text-decoration: none; 
	}
</style>
<title>사이드</title>
</head>
<body>
	<h1>사이드 메뉴</h1>
		<h1>
			<a href="#" class="no_underline">회원관리</a><br>
			<a href="#" class="no_underline">게시판관리</a><br>
			<a href="#" class="no_underline">상품관리</a><br>
		
		</h1>
</body>
</html>