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
    <title>Title</title>
</head>
<body>
<FIELDSET>
    <h4>功能一：默认支持ServletAPI</h4>
    <a href="/params/gotoParams.do?id=100&name=lisi">测试</a>
</FIELDSET>
<FIELDSET>
    <h4>功能二：绑定简单数据类型</h4>
    <a href="/params/gotoParamsBase.do?id=100&name=lisi">测试</a>
</FIELDSET>
<FIELDSET>
    <h4>功能三：当形参和传递的参数名称不一致时使用RequestParam进行手动映射</h4>
    <a href="/params/gotoParamsRequestParam.do?ids=100">测试</a>
</FIELDSET>
<FIELDSET>
    <h4>功能四：绑定pojo对象</h4>
    <a href="/params/gotoParamsPojo.do?id=100&name=lisi&sex=nan">测试</a>
</FIELDSET>
<FIELDSET>
    <h4>功能五：绑定pojo对象的包装对象</h4>
    <a href="/params/gotoParamsQueryVo.do?user.id=100&user.name=lisi&user.sex=nan">测试</a>
</FIELDSET>
<FIELDSET>
    <h4>功能六：绑定pojo对象的list集合</h4>
    <%--<a href="/params/gotoParamsList.do?userList[0].id=100&userList[0].name=lisi&userList[0].sex=nan">测试</a>--%>
    <form action = "/params/gotoParamsList.do" method="post">
        <input type="text" name="userList[0].id" placeholder="请输入id"/>
        <input type="text" name="userList[0].name" placeholder="请输入用户名"/>
        <input type="text" name="userList[0].sex" placeholder="请输入性别"/>
        <br/>
        <input type="text" name="userList[1].id" placeholder="请输入id"/>
        <input type="text" name="userList[1].name" placeholder="请输入用户名"/>
        <input type="text" name="userList[1].sex" placeholder="请输入性别"/>
        <br/> <input type="submit" value="提交">
    </form>
</FIELDSET>
<FIELDSET>
    <h4>功能七：绑定pojo对象的Map集合</h4>
    <%--<a href="/params/gotoParamsList.do?userList[0].id=100&userList[0].name=lisi&userList[0].sex=nan">测试</a>--%>
    <form action = "/params/gotoParamsMap.do" method="post">
        <input type="text" name="userMap['u001'].id" placeholder="请输入id"/>
        <input type="text" name="userMap['u001'].name" placeholder="请输入用户名"/>
        <input type="text" name="userMap['u001'].sex" placeholder="请输入性别"/>
        <br/> <input type="submit" value="提交">
    </form>
</FIELDSET>
<FIELDSET>
    <h4>功能八：字符串转成日期对象</h4>
    <a href="/params/gotoParamsDate.do?date=2021-6-22">测试</a>
</FIELDSET>
<FIELDSET>
    <h4>功能九：通过注解RequestHeader获取请求头中指定信息</h4>
    <a href="/params/gotoParamsRequestHeader.do">测试</a>
</FIELDSET>
<FIELDSET>
    <h4>功能十：获取Cookie中的cookie值</h4>
    <a href="/params/gotoParamsCookie.do">测试</a>
</FIELDSET>
</body>
</html>
