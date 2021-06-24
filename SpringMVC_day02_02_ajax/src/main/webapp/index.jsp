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
    <!--VUE使用的环境-->
    <script src=""></script>
</head>
<body>
<FIELDSET>
    <h4>Json格式数据实现Ajax交互</h4>
    <div id="app">
        <input type="button" value="测试ajax" @click="clickMe()">
    </div>
</FIELDSET>
</body>
</html>
<script>
    //创建Vue对象
    new Vue({
        el:"#app",
        data:{
            userList : []
        },
        methods:{
            clickMe : function () {
                //alert("hahah")
                //使用axios中的post方法，发起ajax请求
                axios.post()
            }
        }
    });
</script>
