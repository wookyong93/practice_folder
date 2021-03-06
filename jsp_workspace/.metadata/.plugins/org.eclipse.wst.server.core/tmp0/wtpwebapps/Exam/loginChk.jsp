<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"
    import="java.util.*, ex01.*"
    %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <jsp:useBean id="dao" class="ex01.ExMemberDAO"/>
    <%request.setCharacterEncoding("UTF-8"); 
    	String id = request.getParameter("user_id");
    	String pw = request.getParameter("user_pw");
    	boolean result=dao.loginChk(id, pw);
    	%>
    <c:set var="result" value="<%=result %>"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<c:if test="${param.user_id == '' }">
<script>alert('아이디를 입력해주세요');location.href="login.jsp";</script>
</c:if>
<c:if test="${param.user_pw == '' }">
<script>alert('비밀번호를 입력해주세요');location.href="login.jsp";</script>
</c:if>
<c:if test="${result == true}">
<%session.setAttribute("user_id", id); %>
<script>alert('<%=id %>님 로그인 하셨습니다.'); location.href="main.jsp";</script>
</c:if>
<c:if test="${result == false }">
<script>alert('ID 와 PW를 확인해 주세요');location.href="login.jsp"</script>
</c:if>

</body>
</html>