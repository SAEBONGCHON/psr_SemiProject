<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글적글적 로그인</title>
<script src="https://code.jquery.com/jquery-3.6.3.js"></script>
</head>
<body>
<!--헤더jsp를 jsp태그로 인클루드로 절대경로 잡아준다.  -->
<jsp:include page="/WEB-INF/view/header.jsp"/>
	<h1>글적글적의 로그인 화면입니다.</h1>
	
	<section>
		<form action="login" method="post" >
			아이디 : <input type="text" name="userid"><br>
			비밀번호 : <input type="password" name="passwd"><br>
			<div>
				<input type="checkbox"><a>로그인 상태 유지</a>
			</div>
			<div>
				<a href="#">비밀번호 찾기</a>
			</div>
			<div>
				<button type="submit">로그인</button>
			</div>
			<div>
				<span><a>회원가입</a></span>
			</div>
		</form>

	</section>
	<script>
	$(".btn.join").on("click", handlerClickBtnJoin)
	$(".btn.write").on("click", handlerClickBtnWrite)
	function handlerClickBtnJoin(){
		console.log("글적글적 핸들러 회원가입 버튼 클릭");
		location.href="<%=request.getContextPath()%>/join"
	}
	function handlerClickBtnWrite(){
		console.log("글적글적 핸들러 글쓰기 버튼 클릭");
		location.href="<%=request.getContextPath()%>/write"
	}
	</script>

</body>
</html>