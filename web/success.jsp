<%@ page import="com.cs.entity.UserInfo" %>
<%@ page import="java.util.List" %>
<%@ page import="com.cs.service.impl.queryServiceImpl" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/5
  Time: 8:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>$Title$</title>
</head>
<body>
<table align="center" width="800px" border="1">
    <tr height="40" align="center">
        <td colspan="7">
            <strong>用户信息列表</strong>
            <span><a href="javascript:add()" style="font-size: 12px">添加</a></span>
        </td>
    </tr>
    <tr height="40" align="center">
        <td>用户编号</td>
        <td>用户姓名</td>
        <td>用户密码</td>
        <td>性别</td>
        <td>年龄</td>
        <td>邮箱</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${list}" var="userInfo">
    <tr height="40" align="center">
        <td>${userInfo.userID}</td>
        <td>${userInfo.userName}</td>
        <td>${userInfo.userPass}</td>
        <td>${userInfo.sex}</td>
        <td>${userInfo.age}</td>
        <td>${userInfo.email}</td>
        <td>
            <a href="javascript:query('${userInfo.userID}')">查看</a>&nbsp;&nbsp;
            <a href="javascript:update('${userInfo.userID}')">修改</a>&nbsp;&nbsp;
            <a href="javascript:del('${userInfo.userID}')">删除</a>&nbsp;&nbsp;
        </td>
    </tr>
    </c:forEach>
</table>
<p align="center">
    <c:if test="${no>1}">
    <a href="pageServlet?no=1">首页</a>
    <a href="pageServlet?no=${no-1}">上一页</a>
    </c:if>
    <c:if test="${no<max}">
    <a href="pageServlet?no=${no+1}">下一页</a>
    <a href="pageServlet?no=${max}">尾页</a>
    </c:if>
</p>
<script type="text/javascript" src="js/show.js"></script>
</body>
</html>
