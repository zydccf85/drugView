<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Login${sessionScope.user }</h1>
	<form action="hello.do" method="post">
	name:<input type="text" name="name"><br/>

	password:<input type="password" name="password"><br/>
	${error }
	<input type="submit" value="Login"/>
	</form>
</body>
</html>