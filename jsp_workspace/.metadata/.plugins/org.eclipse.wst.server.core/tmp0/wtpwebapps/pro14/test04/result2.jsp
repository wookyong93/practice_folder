<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "quiz01.*"
    isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${empty param.id}">
	<h1>아이디를 입력하세요!!</h1><br>
	<a href="login.jsp">로그인 페이지로 이동</a>
	</c:if>
	<c:if test="${not empty param.id}">
		<c:if test="${param.id == 'admin'}">
		<h1>관리자로 로그인 했습니다.</h1><br>
		<input type="button" value="회원정보 삭제하기"/>
		<input type="button" value="회원정보 수정하기"/>
		</c:if>
		<c:if test="${param.id != 'admin'}">
		<h1>환영합니다. ${param.id} 님!!!</h1><br>
		</c:if>
	</c:if>
</body>
</html>