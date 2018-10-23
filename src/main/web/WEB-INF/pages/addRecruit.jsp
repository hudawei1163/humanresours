<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/23
  Time: 0:37
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
    <title>添加招聘信息</title>
</head>
<body>
对招聘信息
进行增删改操作
发布按钮
<a href="admin.jsp">返回</a>
</body>
</html>

