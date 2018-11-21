<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/11/2
  Time: 15:40
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
    <title>员工信息</title>
</head>
<body>
<a href="../../index.jsp">首页</a>
<a href="queryAllStaff">返回</a>
<fieldset style="padding-left: 10%;background: pink">
    <legend>员工信息</legend><br/>
    <form action="" method="post">
        <table>
            <tr>
                <td>姓　　名:</td>
                <td>${requestScope.staff.s_name}</td>
            </tr>
            <tr>
                <td>工　　号:</td>
                <td>${requestScope.staff.s_id}</td>
            </tr>
            <tr>
                <td>手　　机:</td>
                <td>${requestScope.staff.s_phone}</td>
            </tr>
            <tr>
                <td>状　　态:</td>
                <td>${requestScope.staff.s_status}</td>
            </tr>
        </table>
    </form>
</fieldset>
</body>
</html>

