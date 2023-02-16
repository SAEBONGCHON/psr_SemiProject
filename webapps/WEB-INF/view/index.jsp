<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글적글적</title>
<script src="https://code.jquery.com/jquery-3.6.3.js"></script>
</head>
<body>
<h1 align="center">글적글적</h1>
	<jsp:include page="/WEB-INF/view/header.jsp"/>
	
	
	<script>
	$(".btn.login").on("click", handlerClickBtnLogin);
	$(".btn.logout").on("click", handlerClickBtnLogout);
		
	function handlerClickBtnLogin(){
		console.log("글적글적 핸들러 로그인 버튼 클릭");
		location.href="<%=request.getContextPath()%>/login"
	}
	function handlerClickBtnLogout(){
		console.log("글적글적 핸들러 로그아웃 버튼 클릭");
		}
	</script>


</body>
</html>