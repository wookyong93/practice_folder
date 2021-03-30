<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>잘못된 접근입니다.</title>
</head>
<body>
<form style="text-align:center;">
<h1> 로그인 후 이용해주세요.<br> ID가 없으신분은 로그인 페이지 이동 후 회원가입을 해주세요</h1>
<a href="<%=request.getContextPath() %>/login.jsp">로그인페이지로 이동</a>
</form>
</body>
</html>