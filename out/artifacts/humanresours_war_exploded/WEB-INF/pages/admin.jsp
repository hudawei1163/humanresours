<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/19
  Time: 15:49
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
    <title>管理员页面</title>
</head>
<body>
<a href="addRecruit">发布招聘信息</a>
对招聘信息增删改查
<a href="queryResume">查看已投简历</a>
</body>
</html>

