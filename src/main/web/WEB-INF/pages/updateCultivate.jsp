<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/24
  Time: 16:25
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
    <title>修改培训</title>
</head>
<body>
<a href="updateCultivateServlet">修改培训</a>
</body>
</html>

