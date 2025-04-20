<%--
  Created by IntelliJ IDEA.
  User: 123456
  Date: 2025/4/6
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a>欢迎</a>
<form action="${pageContext.request.contextPath}/login" method="post" id="loginForm">
<div class="form-group">
    <label for="username">用户：</label>
    <input type="text" id="username" name="username" required>
</div>
<div class="form-group">
    <label for="password">密码：</label>
    <input type="password" id="password" name="password" required>
</div>
<button type="submit">登录</button>
<button type="button"
onclick="window.location.href='${pageContext.request.contextPath}/Rejister.jsp'">注册</button>
</form>
</body>
</html>
