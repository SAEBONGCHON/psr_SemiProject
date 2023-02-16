<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.3.js"></script>
</head>
<body>

<section>
        <form action="">
            <h3>회원가입</h3>
            <div>
                <label>아이디</label>
                <input type="text">
            </div>
            <div>
                <label>비밀번호</label>
                <input type="password" placeholder="최소 8자리 이상">
            </div>
            <div>
                <label>비밀번호 확인</label>
                <input type="password">
            </div>
            <div>
                <label>닉네임</label>
                <input type="text">
            </div>
            <div>
                <label>이메일주소</label>
                <input type="email">
                <a>@</a>
                <select>
                    <option>naver.com</option>
                    <option>daum.net</option>
                    <option>nate.com</option>
                    <option selected>필수선택</option>
                </select>
            </div>
            <span>
                <input type="checkbox">
                이용약관 및 개인정보처리 방침 동의
                [<a href="#">보기</a>]
            </span>
            <div>
                <button type="submit">
                    <span>회원가입</span>
                </button>
            </div>
        </form>
        <div>
            이미 계정이 있습니까?
            <a href="#">
                <span>로그인</span>
            </a>
        </div>
    </section>	
</body>
</html>