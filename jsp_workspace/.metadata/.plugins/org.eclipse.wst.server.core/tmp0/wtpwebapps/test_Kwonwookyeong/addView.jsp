
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*,ex01.*"
    isELIgnored="false"
    %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <jsp:useBean id="dao" class="ex01.BoardDAO"/>
    <% request.setCharacterEncoding("UTF-8");
    	int num = dao.wirteNum();
    	String id=(String)session.getAttribute("id_");
    %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
<script>
	function fn_con(){
		var frm= document.frmadd;
		var title=frm.title.value;
		var text = frm.content.value;
		var fileName=frm.imageFileName.value;
		frm.action="addContent.jsp";
		frm.submit();
	}
</script>
</head>
<body>
<form style="text-align:center" name='frmadd'>
<h1>게시글 작성</h1>
	<table align="center" width="800" border="1">
	<tr align="center">
		<th width="10%">글 번호</th>
		<th width="60%">글 제목</th>
		<th width="10%">작성자 ID</th>
	</tr>
	<tr align="center">
		<th><%=num %></th>
		<th><input type="text" name="title" style="width:90%" placeholder="글 제목을 입력 해주세요"></th>
		<th><%=id %></th>
	</tr>
	<tr align="center">
		<th colspan="3">글 내 용</th>
	</tr>
	<tr align="left">
		<td colspan="3" width="80%" height="400"><textarea style="width:99%;height:90%; resize: none; font-size:15px;" name="content" placeholder="내용을 입력해주세요"></textarea>
		</td>
	</tr>
	<tr align="left">
		<td colspan="3" width="80%">이미지파일 : <input type="text" style="width:50%" name="imageFileName"/></td>
	</tr>
	</table>
	<br>
	<input type="button" value="등록하기" onclick="fn_con()"/> <input type="button" value="게시판 이동" onclick="location.href='boardMain.jsp'" />
</form>

</body>
</html>