<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/24
  Time: 14:47
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
    <title>修改部门</title>
</head>
<body>
<div style="padding-top: 5%;padding-left: 35%;padding-right: 35%">
    <fieldset style="padding-left: 20%;background: aquamarine">
        <legend>增加部门</legend><br/>
        <form action="updateDepartmentServlet" method="post">
            <table>
                <tr>
                    <input type="hidden" name="d_id" value="${requestScope.department.d_id}"/>
                    <td>创建日期</td>
                    <td>名　　称</td>
                </tr>
                <tr>
                    <td>
                        <jsp:useBean id="now" class="java.util.Date" scope="page"/>
                        <fmt:formatDate var="now" value="${now}" pattern="yyyy-MM-dd"/>
                        ${now}
                        <input type="hidden" name="d_time" value="${now}">
                    </td>
                    <td><input type="text" name="d_name" id="d_name"required/></td>
                </tr>
                <tr>
                    <td></td>
                    <td style="color: red">
                        ${requestScope.msg}
                    </td>
                </tr>
                <tr>
                    <td><input type="submit" value="修　　改"></td>
                    <td><a href="admin">返回</a></td>
                </tr>
            </table>
        </form>
    </fieldset>
</div>
</body>
</html>

