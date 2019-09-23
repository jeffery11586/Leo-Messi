<%--
  Created by IntelliJ IDEA.
  User: Jeffery
  Date: 2019/9/22
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <style type="text/css">
        body {
            text-align: center;
        }

        span {
            color: red;
            font-size: 200%
        }

        hr {
            margin-bottom: 30px
        }
    </style>
</head>
<body>
<span> 登录 </span>
<hr color="red" />
<form action="Servlet" method="post">
    <table border="1" bordercolor="blue" width="40%" cellspacing="0" align="center">
        <tr>
            <td>请输入用户名：</td>
            <td><input type="text" name="username" /></td>
        </tr>
        <tr>
            <td>请输入密码：</td>
            <td><input type="password" name="passwd" /></td>
        </tr>
        <tr align="center">
            <td colspan="2">
                <input type="submit" value="登陆" /> <input type="reset" value="重置" />
                <a href="RegistView.html">注册</a>
            </td>
        </tr>
    </table>
</form>
</body>
</html>