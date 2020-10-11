<%@ page import="com.cs.entity.UserInfo" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/6
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>$Title$</title>
    <script type="text/javascript">
        function ba() {
            history.back();
        }
    </script>
</head>
<body>
<form action="dologin.jsp" method="post">
    <table align="center" width="500px" border="1">
        <tr height="40px" align="center">
            <td colspan="2"><strong>用户信息</strong></td>
        </tr>
        <tr height="40px">
            <td align="right">用户编号：</td>
            <td>
                ${us.userID}
            </td>
        </tr>
        <tr height="40px">
            <td align="right">用户姓名：</td>
            <td>
                ${us.userName}
            </td>
        </tr>
        <tr height="40px">
            <td align="right">用户密码：</td>
            <td>
                ${us.userPass}
            </td>
        </tr>
        <tr height="40px">
            <td align="right">用户性别：</td>
            <td>
                ${us.sex}
            </td>
        </tr>
        <tr height="40px">
            <td align="right">用户年龄：</td>
            <td>
                ${us.age}
            </td>
        </tr>
        <tr height="40px">
            <td align="right">用户邮箱：</td>
            <td>
                ${us.email}
            </td>
        </tr>
        <tr height="40px">
            <td></td>
            <td>
                <input type="button" value="返回" onclick="ba()"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>

