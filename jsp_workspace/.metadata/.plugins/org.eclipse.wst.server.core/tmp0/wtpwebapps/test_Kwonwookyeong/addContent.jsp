<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*,ex01.*"
    isELIgnored="false"
    %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <jsp:useBean id="dao" class="ex01.BoardDAO"/>
    <jsp:useBean id="dto" class="ex01.BoardDTO"/>
   
    <%	
    	request.setCharacterEncoding("UTF-8");
    	String id = (String)session.getAttribute("id_");
    	String title=(String)request.getParameter("title");
    	int num = dao.wirteNum();
    	String content=(String)request.getParameter("content");
    	String ifm=(String)request.getParameter("imageFileName");
    	dto = new BoardDTO();
    	dto.setArticleNO(num);
    	dto.setTitle(title);
    	dto.setContent(content);
    	dto.setImageFileName(ifm);
    	dto.setId(id);
    	dao.writeCon(dto);
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<script type="text/javascript">alert('게시글이 저장되었습니다.');location.href="boardMain.jsp";</script>
</body>
</html>