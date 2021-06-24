<%--
  Created by IntelliJ IDEA.
  User: wjq
  Date: 2021/6/23
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<fieldset>
    <h4>使用RestFul风格访问资源-------------GET查询</h4>
    <a href="${pageContext.request.contextPath}/user/1">get方法实现查询</a>
</fieldset>
<fieldset>
    <h4>使用RestFul风格访问资源-------------POST 新增</h4>
    <form action="${pageContext.request.contextPath}/user/1" method="post">
        <input type="submit" value="post方式实现新增">
    </form>
</fieldset>
<fieldset>
    <h4>使用RestFul风格访问资源-------------PUT 更新</h4>
    <form action="${pageContext.request.contextPath}/user/1" method="post">
        <%--配置隐藏的http提交方式的配置 需要在web.xml文件中开启隐藏的http提交方式的支持--%>
        <input type="hidden" name="_method" value="PUT">
        <input type="submit" value="put方式实现更新">
    </form>
</fieldset>
<fieldset>
    <h4>使用RestFul风格访问资源-------------POST 新增</h4>
    <form action="${pageContext.request.contextPath}/user/1" method="post">
        <input type="hidden" name="_method" value="DELETE">
        <input type="submit" value="DELETE方式实现删除">
    </form>
</fieldset>
</body>
</html>
