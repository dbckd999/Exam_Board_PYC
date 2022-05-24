<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
</head>
<body>

번호: ${dto.b_no}<br>
ID: ${dto.b_id}<br>
제목: ${dto.b_title}<br>
내용: ${dto.b_content}<br>
<fmt:formatDate value="${dto.b_written_date}" pattern="yyyy-MM-DD HH:MM:ss" /><br>

<a href="/aContentUpdate?b_no=${dto.b_no}">수정하기</a>
<a href="/">목록으로</a>

</body>
</html>