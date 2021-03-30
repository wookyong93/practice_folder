<%@page import="member.*,java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <jsp:useBean id="dao" class="member.MemberDAO"/>
    <%
    	request.setCharacterEncoding("UTF-8");
    	String id = request.getParameter("id");
    	String pwd = request.getParameter("pwd");
    	boolean result = dao.LoginCheck(id, pwd);
    	if(result){
    		System.out.print("로그인성공");
    		session.setAttribute("loginID", id);
    	}else{
    		System.out.print("로그인실패");
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="<%=result == true%>">
		<script>alert('로그인성공');
				location.href="boardMain.jsp";
		</script>
	</c:if>
	<c:if test="<%=result == false%>">
	<script>
	alert('로그인실패');
	location.href="login.jsp";		
	</script>
	</c:if>
</body>
</html>