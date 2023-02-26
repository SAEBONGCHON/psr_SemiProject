<script src="<%=request.getContextPath() %>/resource/css/reset/css"> 
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
	$(".btn.logout").on("click", handlerClickBtnLogout)
	$(".btn.join").on("click", handlerClickBtnJoin)
	$(".btn.write").on("click", handlerClickBtnWrite)
	$(".btn.login").on("click", handlerClickBtnLogin)
	$(".btn.search").on("click", handlerClickBtnSearch)
	
	function handlerClickBtnLogin(){
		console.log("글적글적 핸들러 로그인 버튼 클릭");
		location.href="<%=request.getContextPath()%>/login"
	}
	function handlerClickBtnLogout(){
		console.log("글적글적 핸들러 로그아웃 버튼 클릭");
		}
	function handlerClickBtnJoin(){
		console.log("글적글적 핸들러 회원가입 버튼 클릭");
		location.href="<%=request.getContextPath()%>/join"
	}
	function handlerClickBtnWrite(){
		console.log("글적글적 핸들러 글쓰기 버튼 클릭");
		location.href="<%=request.getContextPath()%>/write"
	}
	</script>
	<hr>
	<!-- <div align="center">
		<form action="">
			<input type="text" placeholde="검색어 입력">
			<button>검색</button>			
		</form>
	</div>
	 -->
	
	
</body>
</html>