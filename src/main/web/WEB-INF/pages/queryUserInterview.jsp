<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/11/2
  Time: 11:28
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
    <title>用户查看面试</title>
</head>
<body>
<a href="user">返回</a>
<fieldset style="padding-left: 10%;background: pink">
    <legend>面试结果</legend><br/>
    <form action="addStaffServlet" method="post">
        <table>
            <c:forEach items="${requestScope.interviews}" var="interviews" varStatus="loop">
                <tr>
                    <td>姓　　名:</td>
                    <td><input type="hidden" name="u_name" value="${interviews.u_name}">${interviews.u_name}</td>
                </tr>
                <tr>
                    <td>手　　机:</td>
                    <td><input type="hidden" name="r_phone" value="${interviews.r_phone}">${interviews.r_phone}</td>
                </tr>
                <tr>
                    <td>职　　位:</td>
                    <td><input type="hidden" name="p_name" value="${interviews.p_name}">${interviews.p_name}</td>
                </tr>
                <tr>
                    <td>状　　态:</td>
                    <td><input type="hidden" name="i_status" value="${interviews.i_status}">${interviews.i_status}</td>
                </tr>
                <tr>
                    <td>面试时间:</td>
                    <td><input type="hidden" name="i_date" value="${interviews.i_date}">${interviews.i_date}</td>
                </tr>
                <tr>
                    <td><input type="submit" value="同　　意"></td>
                    <td><input type="button" onclick="location='user'" value="忽　　略"></td>
                </tr>
            </c:forEach>
        </table>
    </form>
</fieldset>

</body>
</html>

