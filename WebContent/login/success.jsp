<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登陆成功</title>
</head>
<body>
登录成功,你提交的数据我:
<%=request.getParameter("uname") %>
<%=request.getParameter("passwd") %>
<a href="<%= request.getContextPath() %>/login/index.jsp">返回登录</a>
</body>
</html>