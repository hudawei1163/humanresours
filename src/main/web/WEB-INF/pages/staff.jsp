<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/23
  Time: 1:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title>员工主页</title>
</head>
<body>
<a href="">修改个人信息</a>
<a href="">培训</a>
<a href="">奖惩</a>
<a href="queryAllstaff">查看员工表</a>
<a href="">打卡</a>
<a href="">我的薪资 查看</a>
</body>
</html>
