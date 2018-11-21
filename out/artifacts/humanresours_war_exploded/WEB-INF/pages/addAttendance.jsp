<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/24
  Time: 16:05
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
    <title>考勤打卡</title>
    
</head>
<body>
<div style="padding-top: 5%;padding-left: 35%;padding-right: 35%">
    <fieldset style="padding-left: 24%;background: aquamarine">
        <legend>考勤打卡</legend><br/>
        <form action="addAttendanceServlet" method="post">
            <table>
                <tr>
                    <td>工号:</td>
                    <td><input type="hidden" name="s_id" value="${sessionScope.staff.s_id}">${sessionScope.staff.s_id}</td>
                </tr>
                <tr>
                    <td>当前时间:</td>
                    <td>
                        <jsp:useBean id="now" class="java.util.Date" scope="page"/>
                        <fmt:formatDate var="now" value="${now}" pattern="yyyy-MM-dd HH-mm-ss"/>
                        ${now}
                        <input type="hidden" name="d_time" value="${now}">
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td style="color: red">${requestScope.msg}</td>
                </tr>
                <tr>
                    <td><input type="submit" value="打　　卡"></td>
                    <td></td>
                </tr>
                <tr>
                    <td><a href="staff">返回</a></td>
                    <td></td>
                </tr>
            </table>
        </form>
    </fieldset>
</div>
</body>
</html>

