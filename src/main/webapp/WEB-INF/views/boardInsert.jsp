<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 작성하기</title>
</head>
<body>

<form action="/boardInsert" method="post">
	ID: <input type="text" name="b_id"><br>
	PW: <input type="text" name="b_pw"><br>
	제목:<input type="text" name="b_title"><br>
	내용:<input type="text" name="b_content"><br>
	<input type="submit" value="작성">
</form>
</body>
</html>