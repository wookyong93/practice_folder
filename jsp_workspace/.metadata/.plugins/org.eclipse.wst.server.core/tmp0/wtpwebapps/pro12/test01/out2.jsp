<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    request.setCharacterEncoding("UTF-8");
    String name=request.getParameter("name");
    String age=request.getParameter("age");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터출력장</title>
<script>
console.log(name);
</script>
</head>
<body>
<%
 if(name !=""|| name.length()!=0){
%>
<h1><%=name %>,<%=age %></h1>
<%
 }else if(name.equals("")){
%>
<h1>이름을 입력하세요</h1>
<%
} 
%>

<%
if(name!=null || name.length()!=0){
%>
<h1><% out.println(name+","+age); %></h1>
<%
}else if(name==""){
%>
<h1>이름을 입력하세요</h1>
<%
} 
%>
</body>
</html>