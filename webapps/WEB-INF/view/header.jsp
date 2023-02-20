<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<header>
<!--EL로 작성하기
loginss이 비어있는지 체크한다, 비어있다면 로그인 표시,
아니라면 로그아웃이 나타나게 한다.-->
	<div align="right">
		<button type="button" class="btn write">글쓰기</button>
		<c:choose>
			<c:when test="${empty loginss }">
				<button type="button" class="btn login">로그인</button>			
				<button type="button" class="btn join">회원가입</button>			
			</c:when>
			<c:otherwise>
				<button type="button" class="btn logout">로그아웃</button>			
			</c:otherwise>
		</c:choose>
	</div>
</header>
