<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "java.util.*,ex01.*"
    isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <jsp:useBean id="dao" class="ex01.MemberDAO"/>
    <jsp:useBean id="dto" class="ex01.MemberDTO"/>
    <%request.setCharacterEncoding("UTF-8");
    boolean result;
    	dto=new MemberDTO();
    	dto.setId(request.getParameter("id"));
    	dto.setPwd(request.getParameter("pwd"));
    	dto.setName(request.getParameter("name"));
    	dto.setEmail(request.getParameter("email"));
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