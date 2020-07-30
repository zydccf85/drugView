<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>test</title>
</head>
<body>
	<h1>欢迎你：${param.adminCode }</h1>
	<h2>现在时间为：${time}</h2>
	<h3>用户名：${sessionScope.user }</h3>
	<a href="login.do">返回登录界面</a>
</body>
</html>