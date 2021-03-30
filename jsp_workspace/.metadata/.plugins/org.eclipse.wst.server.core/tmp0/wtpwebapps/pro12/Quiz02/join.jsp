<%@page import="java.util.List"%>
<%@page import="java.sql.Date"%>
<%@page import="Quiz.q01.MemberDAO"%>
<%@page import="Quiz.q01.MemberDTO"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    request.setCharacterEncoding("UTF-8");
    response.setContentType("text/html;charset=UTF-8");
    
    MemberDAO dao=new MemberDAO();
    String _id = request.getParameter("id");
    String _pw =request.getParameter("pw");
    String _name=request.getParameter("name");
    String _email=request.getParameter("email");
   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입완료페이지</title>
</head>
<body>
<%if(dao.chkID(_id)){ 
	MemberDTO dto=new MemberDTO();
	dto.setId(_id);
	dto.setPwd(_pw);
	dto.setName(_name);
	dto.setEmail(_email);
	dao.addMember(dto);
	List membersList = dao.listMembers(dto);
%>
<table border=1>
	<tr><th colspan=2>가입 정보</th></tr>
	<%
	 for (int i=0; i < membersList.size(); i++){
	      dto=(MemberDTO) membersList.get(i);
      String id=dto.getId();
      String pwd=dto.getPwd();
      String name=dto.getName();
      String email=dto.getEmail();
      Date joinDate=dto.getJoinDate();
%>
	<tr><td>ID</td><td><%=id %></td>
	<tr><td>PW</td><td><%=pwd %></td>
	<tr><td>이름</td><td><%=name %></td>
	<tr><td>email</td><td><%=email %></td>
	<tr><td>가입일</td><td><%=joinDate %></td>
</table>
<%}
}else{ %>
<h1>중복된 아이디입니다.</h1>
<a href='memberJoin.jsp'>회원가입 페이지 이동</a>
<%
}
%>
</body>
</html>