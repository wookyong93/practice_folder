<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "java.util.*,ex01.*"
    isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <jsp:useBean id="dao" class="ex01.ExMemberDAO"/>
    <jsp:useBean id="dto" class="ex01.ExMemberDTO"/>
    <%request.setCharacterEncoding("UTF-8");
    boolean result;
    	dto=new ExMemberDTO();
    	dto.setUser_id(request.getParameter("user_id"));
    	dto.setUser_pw(request.getParameter("user_pw"));
    	dto.setUser_name(request.getParameter("user_name"));
    	dto.setUser_email(request.getParameter("user_email"));
    	dao.addMember(dto);
    	
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>가입성공 유무</title>
</head>
<body>
<script>alert('가입성공 로그인 페이지로 이동합니다.');location.href="login.jsp"</script>
</body>
</html>