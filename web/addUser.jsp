<%@ page import="com.cs.entity.UserInfo" %><%--
  Created by IntelliJ IDEA.
  User: 蚂蚁
  Date: 2020/10/8
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        td{
            width: 33%;
        }
    </style>
</head>
<body>
<form action="addServlet" method="post" id="add">
    <table align="center" width="600px" border="1">
        <input type="hidden" name="id" value=""/>
        <tr height="40px" align="center">
            <td colspan="3"><strong>用户信息</strong></td>
        </tr>
        <tr height="40px">
            <td align="right">用户姓名：</td>
            <td>
                <input type="text" name="username" id="username" value=""/>
            </td>
            <td id="musername"></td>
        </tr>
        <tr height="40px">
            <td align="right">用户密码：</td>
            <td>
                <input type="text" name="password" id="password" value=""/>
            </td>
            <td id="mpassword"></td>
        </tr>
        <tr height="40px">
            <td align="right">用户性别：</td>
            <td>
                <input type="text" name="sex" id="sex" value=""/>
            </td>
            <td id="msex"></td>
        </tr>
        <tr height="40px">
            <td align="right">用户年龄：</td>
            <td>
                <input type="text" name="age" id="age" value=""/>
            </td>
            <td id="mage"></td>
        </tr>
        <tr height="40px">
            <td align="right">用户邮箱：</td>
            <td>
                <input type="text" name="email" id="email" value=""/>
            </td>
            <td id="memail"></td>
        </tr>
        <tr height="40px">
            <td></td>
            <td>
                <input type="submit" value="添加"/>
            </td>
            <td></td>
        </tr>
    </table>
</form>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="js/add.js"></script>
</body>
</html>
