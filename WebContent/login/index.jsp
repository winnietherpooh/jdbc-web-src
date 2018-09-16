<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>欢迎登录</title>
</head>
<body>
<form action="<%=request.getContextPath() %>/checkServlet" method="post">
<input type="text" name="uname">
<input type="text" name="passwd">
<button type="submit" >提交</button>
</form>
</body>
</html>