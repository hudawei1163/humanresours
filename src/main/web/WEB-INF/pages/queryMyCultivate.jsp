<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/11/5
  Time: 2:17
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
    <title>我的培训</title>
</head>
<body>
<a href="staff">返回</a>
<div style="padding-top: 5%;padding-left: 35%;padding-right: 35%">
    <fieldset style="padding-left: 24%;background: aquamarine">
        <legend>全部培训</legend><br/>
        <form action="" method="post">
            <table>
                <c:forEach items="${requestScope.cultivates}" var="cultivates" varStatus="loop">
                    <tr>
                        <td></td>
                        <td><input type="hidden" name="c_id" value="${cultivates.c_id}"></td>
                    </tr>
                    <tr>
                        <td>工　　号:</td>
                        <td>${cultivates.s_id}</td>
                    </tr>
                    <tr>
                        <td>主　　题:</td>
                        <td>${cultivates.c_theme}</td>
                    </tr>
                    <tr>
                        <td>开始时间:</td>
                        <td>${cultivates.c_start_time}</td>
                    </tr>
                    <tr>
                        <td>结束时间:</td>
                        <td>${cultivates.c_end_time}</td>
                    </tr>
                    <tr>
                        <td>地　　址:</td>
                        <td>${cultivates.c_address}</td>
                    </tr>
                </c:forEach>
            </table>
        </form>
    </fieldset>
</div>
</body>
</html>

