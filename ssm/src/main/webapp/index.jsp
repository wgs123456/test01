<%--
  Created by IntelliJ IDEA.
  User: WGS
  Date: 2019/3/16
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="account/findAll">测试</a><br>

<form method="post" action="account/saveAccount">
    姓名：<input type="text" name="name"><br>
    money：<input type="text" name="money"><br>
    <input type="submit" value="保存">
</form>

<form method="post" action="account/transfer">
    转账人：<input type="text" name="name"><br>
    收款人：<input type="text" name="targetName"><br>
    金&nbsp;&nbsp;额&nbsp;：<input type="text" name="money"><br>
    <input type="submit" value="确认转账">
</form>
</body>
</html>
