<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/11/4
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
    <title>员工考勤记录</title>
</head>
<body>
<a href="admin">返回</a>
<div style="padding-top: 5%;padding-left: 35%;padding-right: 35%">
    <fieldset style="padding-left: 24%;background: aquamarine">
        <legend>我的考勤</legend><br/>
        <form action="" method="post">
            <table>
                <c:forEach items="${requestScope.attendances}" var="attendances" varStatus="loop">
                    <tr>
                        <td>工　　号:</td>
                        <td>${attendances.s_id}</td>
                    </tr>
                    <tr>
                        <td>上班时间:</td>
                        <td>${attendances.a_up_work}</td>
                    </tr>
                    <tr>
                        <td>下班时间:</td>
                        <td>${attendances.a_down_work}</td>
                    </tr>
                    <tr>
                        <td>状　　态:</td>
                        <td>${attendances.a_state}</td>
                    </tr>
                </c:forEach>
            </table>
        </form>
    </fieldset>
</div>
</body>
</html>

