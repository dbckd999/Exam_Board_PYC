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

<a href="/boardInsert">글 작성하기</a><br>

<table border=1>
<c:forEach var="dto" items="${list}">
	<tr>
		<td>${dto.b_no}</td>
		<td>${dto.b_id}</td>
		<td><a href="/aContent?b_no=${dto.b_no}">${dto.b_title}</a></td>
		<td><fmt:formatDate value="${dto.b_written_date}" pattern="yyyy-MM-DD HH:MM:ss" /></td>
		<td><a href="/aContentDelete?b_no=${dto.b_no}">삭제</a></td>
	</tr>
</c:forEach>
</table>
</body>
</html>