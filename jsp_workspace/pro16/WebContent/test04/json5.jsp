<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSON ajax 연습</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script>
$(function(){
	$("#checkjson").click(function(){
		var _jsonInfo='{"name":"박지성","age":25,"gender":"남자","nickname":"날쌘돌이"}';
		$.ajax({
			type:"post",
			asyn:false,
			url:"${contextPath}/json",
			data:{jsonInfo:_jsonInfo},
			success:function(data,textStatus){
				
			},error:function(data,textStatus){
				alert('에러발생');
			},
			complete:function(data,textStatus){
				//ajax end
			}
		});
	});
});
</script>

</head>
<body>
	<a id="checkjson" style="cursor:pointer">전송</a>
	<div id="output"></div>
</body>
</html>