<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    int dan =Integer.parseInt(request.getParameter("dan"));
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단 출력창</title>
</head>
<body>
	<table border=1 width="800">
		<tr align="center" bgcolor="#ffff66">
		<th colspan="2"><%=dan %>단 출력</th></tr>
		<%for(int i=1;i<10;i++){ %>
		<tr align="center">
			<td width="400">
			<%=dan %> * <%=i %>
			</td><td width="400">
			<%=dan*i %></td>
			</tr>
			<%}%>
	</table>

</body>
</html>