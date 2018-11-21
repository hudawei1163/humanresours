<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/19
  Time: 13:49
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
    <title>用户查看招聘信息</title>
    <style>
        td{
            text-align:center;
        }
    </style>
</head>
<body>
<fieldset style="padding-left: 10%;background: pink">
    <legend>招聘信息</legend><br/>
    <form action="deliverResumeServlet" method="post">
        <table border="1">
            <tr>
                <td><input type="button" onclick="location='queryUserResumeServlet'"value="投递简历"/></td>
                <td><a href="user">返回</a></td>
            </tr>
            <tr>
                <td>职　　位</td>
                <td>学　　历</td>
                <td>人　　数</td>
                <td>薪　　资</td>
                <td>工作经验</td>
                <td>工作地点</td>
                <td>发布日期</td>
            </tr>
            <c:forEach items="${requestScope.recruits}" var="recruits" varStatus="loop">
                <tr>
                <td>${positions[loop.count-1].p_name}</td>
                <td>${recruits.r_education}</td>
                <td>${recruits.r_peopleNumber}人</td>
                <td>${recruits.r_salary}元</td>
                <td>${recruits.r_workExperience}年</td>
                <td>${recruits.r_workplace}</td>
                <td>${recruits.r_date}</td>
                </tr>
            </c:forEach>
        </table>
    </form>
</fieldset>
</body>
</html>

