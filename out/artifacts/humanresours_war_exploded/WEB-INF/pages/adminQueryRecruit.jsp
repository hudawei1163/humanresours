<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/11/1
  Time: 13:21
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
    <title>管理员查看招聘信息</title>
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
                <td><a href="admin">返回</a></td>
            </tr>
            <tr>
                <td>职　　位</td>
                <td>学　　历</td>
                <td>人　　数</td>
                <td>薪　　资</td>
                <td>工作经验</td>
                <td>工作地点</td>
                <td>发布日期</td>
                <td>删　　改</td>
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
                    <td><a href="updateRecruit?r_id=${recruits.r_id}">修改</a>/<a href="deleteRecruitServlet?r_id=${recruits.r_id}">删除</a></td>
                </tr>
            </c:forEach>
        </table>
    </form>
</fieldset>
</body>
</html>

