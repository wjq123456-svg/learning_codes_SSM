<%--
  Created by IntelliJ IDEA.
  User: wjq
  Date: 2021/6/18
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<fieldset>
    <h4>用法1：多个URL路径映射到同一个Handler（同一个方法中）</h4>
    <a href="http://localhost:9090/gotoResultURL1.do">测试gotoResultURL1</a><br/>
    <a href="${pageContext.request.contextPath}/gotoResultURL2.do">测试gotoResultURL2</a>
</fieldset>
</body>
</html>
