<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "java.util.* ,ex01.*"
    isELIgnored="false"
    %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <jsp:useBean id="dao" class="ex01.MemberDAO"/>
    <jsp:useBean id="Bdto" class="ex01.BoardDTO"/>
    <jsp:useBean id="Bdao" class="ex01.BoardDAO"/>
    <%
    request.setCharacterEncoding("UTF-8");
    String id = request.getParameter("id");
    String pwd = request.getParameter("pwd");
    boolean result =dao.loginChk(id, pwd);
    
    %>
    <c:set var="result" value="<%=result %>"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<c:if test="${result == true }">
	<%	session.setAttribute("id_", id); 
		
    	%>
    <jsp:forward page="boardMain.jsp"/>
<script type="text/javascript"> alert('<%=id%>님 로그인하셨습니다.');location.href="boardMain.jsp";</script>
</c:if>
<c:if test="${result==false}">
<script>alert('ID와 PW 를 확인해주세요');location.href='login.jsp';</script>
</c:if>
</body>
</html>