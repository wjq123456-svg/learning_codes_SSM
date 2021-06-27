<%--
  Created by IntelliJ IDEA.
  User: wjq
  Date: 2021/6/25
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<fieldset>
    <h4>测试登录案例</h4>
    <form method="post" action="/user/login.do">
        用户名：<input type="text" name="username"><br>
        密    码：<input type="password" name="password"><br>
        <input type="submit" value="登录">
    </form>
</fieldset>
</body>
</html>
