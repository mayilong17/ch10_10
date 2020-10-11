<%@ page import="com.cs.entity.UserInfo" %><%--
  Created by IntelliJ IDEA.
  User: 蚂蚁
  Date: 2020/10/8
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="updateServlet" method="post">
    <table align="center" width="500px" border="1">
        <input type="hidden" name="id" value="${us.userID}"/>
        <tr height="40px" align="center">
            <td colspan="2"><strong>用户信息</strong></td>
        </tr>
        <tr height="40px">
            <td align="right">用户姓名：</td>
            <td>
                <input type="text" name="username" value="${us.userName}"/>
            </td>
        </tr>
        <tr height="40px">
            <td align="right">用户密码：</td>
            <td>
                <input type="text" name="password" value="${us.userPass}"/>
            </td>
        </tr>
        <tr height="40px">
            <td align="right">用户性别：</td>
            <td>
                <input type="text" name="sex" value="${us.sex}"/>
            </td>
        </tr>
        <tr height="40px">
            <td align="right">用户年龄：</td>
            <td>
                <input type="text" name="age" value="${us.age}"/>
            </td>
        </tr>
        <tr height="40px">
            <td align="right">用户邮箱：</td>
            <td>
                <input type="text" name="email" value="${us.email}"/>
            </td>
        </tr>
        <tr height="40px">
            <td></td>
            <td>
                <input type="submit" value="修改"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
