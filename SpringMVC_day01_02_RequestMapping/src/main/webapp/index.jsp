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
<fieldset>
    <h4>用法2：RequestMapping注解作用在类上，实现对请求路径的分类管理，限定类中方法访问的前缀</h4>
    <a href="http://localhost:9090/user/gotoResultURL1.do">测试User gotoResultURL1</a><br/>
    <a href="${pageContext.request.contextPath}/default/gotoResultURL1.do">测试Default gotoResultURL1</a>
</fieldset>
<fieldset>
    <h4>用法3：method属性限定请求方法：请求的handler相同，请求方式不同进入不同方法处理</h4>
    <a href="http://localhost:9090/default/gotoResultMethod.do">Get请求</a><br/>
    <form action="/default/gotoResultMethod.do" method="post">
        <input type="submit" value="Post请求">
    </form>
</fieldset>
<fieldset>
    <h4>用法4：Params属性限定请求参数：支持简单的表达式语法，url一样，根据携带参数的不同进入不同的方法处理</h4>
    <a href="http://localhost:9090/user/login.do?type=user">普通用户</a><br/>
    <a href="http://localhost:9090/user/login.do?type=admin">管理员</a><br/>
    <a href="http://localhost:9090/user/login.do?type=vip">VIP</a><br/>

</fieldset>
</body>
</html>
