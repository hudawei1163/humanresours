<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/11/3
  Time: 22:47
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
    <title>查看部门</title>
</head>
<body>
<a href="admin">返回</a>
<fieldset style="padding-left: 10%;background: pink">
    <legend>查看部门</legend><br/>
    <form action="" method="post">
        <table>
            <c:forEach items="${requestScope.departments}" var="departments" varStatus="loop">
                <tr>
                    <td></td>
                    <td><input type="hidden" name="d_id" id="d_id"value="${departments.d_id}"/></td>
                </tr>
                <tr>
                    <td>部门名称:</td>
                    <td>${departments.d_name}</td>
                </tr>
                <tr>
                    <td>创建时间:</td>
                    <td>${departments.d_time}</td>
                </tr>
                <tr>
                    <td><a href="updateDepartment?d_id=${departments.d_id}">修　　改</a></td>
                    <td><a href="deleteDepartmentServlet?d_id=${departments.d_id}">删　　除</a></td>
                </tr>
            </c:forEach>
        </table>
    </form>
</fieldset>
</body>
</html>

