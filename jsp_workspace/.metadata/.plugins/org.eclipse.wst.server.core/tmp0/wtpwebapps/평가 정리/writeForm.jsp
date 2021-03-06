<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 작성</title>
<style>
	body{
		text-align: center;
	}
	table{
		margin:auto;
		text-align: center;
	}

</style>
</head>
<body>
	<c:if test="${empty loginID}">
		<script>
		alert('로그인이 되어있지 않습니다. 로그인해주세요');
		location.href="login.jsp";
		</script>
	</c:if>
	<span>${loginID}님 환영합니다.</span>
	<a href="logout.jsp">로그아웃</a>
	<br><br>
	<form name="frm" action="boardMain.jsp" method="post">
		<table>
			<tr>
				<th colspan ="2"><h3>글쓰기</h3></th>
			</tr>
			<tr>
				<th width=10%>제목</th>
				<td><input type="text" size="40" name="title"/></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea rows="10" cols="40" name="content"></textarea></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="저장"/>
					<input type="reset" value="초기화"/>
					<input type="button" value="목록" onclick="location.href='boardMain.jsp'"/>
				</td>
			</tr>	
		</table>
		<input type="hidden" name="command" value="write">
	</form>
</body>
</html>