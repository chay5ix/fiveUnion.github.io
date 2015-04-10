<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort() + "/";
%>
<!DOCTYPE html>
<html>
<head>
<title>Index Page</title>
</head>
<body>
	<h1>登录</h1>
	<form action="${request.getContextPath }login/validate" method="post" >
		用户名：<input type="text" name="name" />
		密&nbsp;码：<input type="password" name="pass" />
		<input type="submit" value="登录">
	</form>
	
</body>
</html>