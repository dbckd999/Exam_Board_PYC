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

<form action="aContentUpdate" method="post">
	<input type="hidden" name="b_no" value="${dto.b_no}">
	ID: <input type="text" name="b_id" value="${dto.b_id}"><br>
	제목:<input type="text" name="b_title" value="${dto.b_title}"><br>
	내용:<input type="text" name="b_content" value="${dto.b_content}"><br>
	<input type="submit" value="작성">
</form>

</body>
</html>