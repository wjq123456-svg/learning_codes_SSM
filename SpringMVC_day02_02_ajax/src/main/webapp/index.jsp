<%--
  Created by IntelliJ IDEA.
  User: wjq
  Date: 2021/6/21
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<FIELDSET>
    <h4>功能一：返回字符串（返回值是视图名称，数据使用Model接口）</h4>
    <a href="/default/gotoResultModel.do">测试</a>
</FIELDSET>
<FIELDSET>
    <h4>功能二：返回字符串（返回值视图名称，数据使用ModelMap类）</h4>
    <a href="/default/gotoResultModelMap.do">测试</a>
</FIELDSET>
<FIELDSET>
    <h4>功能三：返回VOID（使用Request对象，进行请求转发）</h4>
    <a href="/default/gotoResultRequest.do">测试</a>
</FIELDSET>
<FIELDSET>
    <h4>功能四：返回VOID（使用Response对象，进行页面的重定向）</h4>
    <a href="/default/gotoResultResponse.do">测试</a>
</FIELDSET>
<FIELDSET>
    <h4>功能五：返回String 通过SpringMVC格式，实现请求转发 不会执行SpringMVC中的视图解析器</h4>
    <a href="/default/gotoResultForward.do">测试</a>
</FIELDSET>
<FIELDSET>
    <h4>功能六：返回String（通过SpringMVC格式，实现重定向 不会执行SpringMVC中的视图解析器）</h4>
    <a href="/default/gotoResultRedirect.do">测试</a>
</FIELDSET>
</body>
</html>
