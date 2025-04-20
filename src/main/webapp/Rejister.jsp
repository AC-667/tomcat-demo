<%--
  Created by IntelliJ IDEA.
  User: 123456
  Date: 2025/4/10
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/rejister" method="post" id="rejistForm">
  <div class="form-group">
    <label for="username">用户：</label>
    <input type="text" id="username" name="username" required>
  </div>
  <div class="form-group">
    <label for="password">密码：</label>
    <input type="password" id="password" name="password" required>
  </div>
  <button type="submit">提交</button>
</body>
</html>
