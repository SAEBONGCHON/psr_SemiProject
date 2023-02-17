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
		<form action="">
			아이디 : <input type="text" name="userid"><br>
			비밀번호 : <input type="password" name="passwd"><br>
			<div>
				<input type="checkbox"><a>로그인 상태 유지</a>
			</div>
			<div>
				<a href="#">비밀번호 찾기</a>
			</div>
			<div>
				<button type="submit" onclick="{login}">로그인</button>
			</div>
			<div>
				<span><a>회원가입</a></span>
			</div>
		</form>

	</section>
	
	

</body>
</html>