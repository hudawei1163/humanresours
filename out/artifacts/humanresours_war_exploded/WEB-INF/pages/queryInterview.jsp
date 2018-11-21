<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/24
  Time: 15:04
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
    <title>查看面试人员</title>
</head>
<body>
<a href="admin">返回</a>
<fieldset style="padding-left: 10%;background: pink">
    <legend>邀请面试</legend><br/>
    <form action="updateInterviewServlet" method="post">
        <table>
            <c:forEach items="${requestScope.interviews}" var="interviews" varStatus="loop">
             <tr>
                 <td></td>
                 <td><input type="hidden" name="i_id" value="${interviews.i_id}"></td>
             </tr>
            <tr>
                <td>姓　　名:</td>
                <td>${interviews.u_name}</td>
            </tr>
            <tr>
                <td>手　　机:</td>
                <td>${interviews.r_phone}</td>
            </tr>
            <tr>
                <td>职　　位:</td>
                <td>${interviews.p_name}</td>
            </tr>
            <tr>
                <td>面试时间:</td>
                <td>${interviews.i_date}</td>
            </tr>
                <tr>
                    <td><input type="submit" value="通　　过"></td>
                    <td><input type="button" onclick="location='admin'" value="未　　过"></td>
                </tr>
            </c:forEach>
        </table>
    </form>
</fieldset>
</body>
</html>

