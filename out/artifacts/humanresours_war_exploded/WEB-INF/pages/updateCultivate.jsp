<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<a href="admin">返回</a>
<div style="padding-top: 5%;padding-left: 35%;padding-right: 35%">
    <fieldset style="padding-left: 24%;background: aquamarine">
        <legend>全部培训</legend><br/>
        <form action="updateCultivateServlet" method="post">
            <table>
                    <tr>
                        <td></td>
                        <td><input type="hidden" name="c_id" value="${cultivate.c_id}"></td>
                    </tr>
                    <tr>
                        <td>工　　号:</td>
                        <td><input type="text" name="s_id" value="${cultivate.s_id}"></td>
                    </tr>
                    <tr>
                        <td>主　　题:</td>
                        <td><input type="text" name="c_theme" value="${cultivate.c_theme}"></td>
                    </tr>
                    <tr>
                        <td>开始时间:</td>
                        <td><input type="datetime-local" name="c_start_time" value="${cultivate.c_start_time}"></td>
                    </tr>
                    <tr>
                        <td>结束时间:</td>
                        <td><input type="datetime-local" name="c_end_time" value="${cultivate.c_end_time}"/></td>
                    </tr>
                    <tr>
                        <td>地　　址:</td>
                        <td><input type="text" name="c_address" value="${cultivate.c_address}"></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="修　　改"></td>
                        <td></td>
                    </tr>
            </table>
        </form>
    </fieldset>
</div>
</body>
</html>

