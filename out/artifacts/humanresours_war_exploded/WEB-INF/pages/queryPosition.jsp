<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/11/3
  Time: 23:29
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
    <title>查看职位</title>
</head>
<body>
<a href="admin">返回</a>
<fieldset style="padding-left: 10%;background: pink">
    <legend>查看职位</legend><br/>
    <form action="" method="post">
        <table>
            <c:forEach items="${requestScope.positions}" var="positions" varStatus="loop">
                <tr>
                    <td><input type="hidden" name="p_id" id="p_id"value="${positions.p_id}"/></td>
                    <td><input type="hidden" name="d_id" id="d_id"value="${positions.d_id}"/></td>
                </tr>
                <tr>
                    <td>职位名称:</td>
                    <td>${positions.p_name}</td>
                </tr>
                <tr>
                    <td><a href="updatePosition?p_id=${positions.p_id}">修　　改</a></td>
                    <td><a href="deletePositionServlet?p_id=${positions.p_id}">删　　除</a></td>
                </tr>
            </c:forEach>
        </table>
    </form>
</fieldset>
</body>
</html>

