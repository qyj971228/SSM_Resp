<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>添加用户信息表单</h1>
    <form name="accountForm" action="/account/save" method="post">
        账户名称:<input type="text" name="name"><br>
        账户金额:<input type="text" name="money"><br>
        <input type="submit" value="提交"><br>
    </form>

</body>
</html>
