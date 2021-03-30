<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="quiz01.*,java.util.*"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
    <jsp:useBean id="dao" class="quiz01.MemberDAO"/>
    <%--클레스 호출 할 경우 jsp:useBean  id= "" class=""사용 --%>
    <%
    request.setCharacterEncoding("UTF-8"); 
    	String id = request.getParameter("id");
    	String pwd = request.getParameter("pwd");
    	boolean result =dao.idCheck(id, pwd);
    %>
   <c:set var="result" value="<%=result %>"/>
    
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 여부</title>
</head>
<body>
	
		<c:if test="${result ==true}">
		<h1><%=id %>님 로그인하셨습니다!!</h1><br>
		</c:if>
		<c:if test="${result ==false }">
		<script>alert('아이디가 틀렸습니다.');location.href='login.jsp';</script>
		</c:if>
	
</body>
</html>