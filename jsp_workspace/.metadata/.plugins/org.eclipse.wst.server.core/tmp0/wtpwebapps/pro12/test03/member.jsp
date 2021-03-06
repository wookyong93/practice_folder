<%@ page language="java" contentType="text/html; charset=UTF-8"
    import="java.util.*"
    import="sec02.ex01.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
h1{
text-align: center;
}
</style>
<meta charset="UTF-8">
<title>회원 정보 출력창</title>
</head>
<body>
<h1>회원 정보 출력</h1>
<%
	request.setCharacterEncoding("UTF-8");
	String _name=request.getParameter("name");
	MemberDTO memberDTO = new MemberDTO();
	memberDTO.setName(_name);
	MemberDAO dao =new MemberDAO();
	List membersList = dao.listMembers(memberDTO);
%>
<table border='1' width='800' align='center'>
	<tr align='center' bgcolor='#FFFF66'>
	<td>아이디</td>
	<td>비밀번호</td>
	<td>이름</td>
	<td>이메일</td>
	<td>가입일자</td>
	</tr>
<%	
   for (int i=0; i < membersList.size(); i++){
      MemberDTO dto=(MemberDTO) membersList.get(i);
      String id=dto.getId();
      String pwd=dto.getPwd();
      String name=dto.getName();
      String email=dto.getEmail();
      Date joinDate=dto.getJoinDate();
%>
     <tr align=center>
       <td><%= id %></td>
       <td><%= pwd %></td>
       <td><%= name %></td>
       <td><%= email %></td>
       <td><%=joinDate  %></td>
     </tr>
   
<%		
   }
%>	
</table>
</body>
</html>