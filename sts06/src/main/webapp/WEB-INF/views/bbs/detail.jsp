<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상세 페이지</h1>
	<div>
		<span>num</span>
		<span>${bean.num }</span>
		<span>writer</span>
		<span>${bean.name }</span>
		<span>date</span>
		<span>${bean.nalja }</span>
	</div>
	<div>
		<span>sub</span>
		<span>${bean.sub }</span>
	</div>
	<div>
		<pre>${bean.content }</pre>
	</div>
	<div>
		<a href="update?idx=${requestScpoe.idx }">update</a>
		<a href="delete?idx=${requestScpoe.idx }">delete</a>
	</div>
</body>
</html>