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
    <h4>本服务内  文件上传</h4>
    <form action="${pageContext.request.contextPath}/update.do" method="post" enctype="multipart/form-data">
        <input type="file" placeholder="请选择要上传的文件" name="uploadFile">
        <input type="text" placeholder="请选择要上传文件的执行者的名称" name="name"/>
        <input type="submit" value="上传文件" >
    </form>

</fieldset>

</body>
</html>
