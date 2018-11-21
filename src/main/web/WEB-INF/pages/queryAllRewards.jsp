<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/11/4
  Time: 16:28
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
    <title>管理员查看奖惩</title>
</head>
<body>
<a href="admin">返回</a>
<div style="padding-top: 5%;padding-left: 35%;padding-right: 35%">
    <fieldset style="padding-left: 24%;background: aquamarine">
        <legend>全部奖惩</legend><br/>
        <form action="" method="post">
            <table>
                <c:forEach items="${requestScope.rewardsList}" var="rewardsList" varStatus="loop">
                    <tr>
                        <td></td>
                        <td><input type="hidden" name="rw_id" value="${rewardsList.rw_id}"></td>
                    </tr>
                    <tr>
                        <td>工　　号:</td>
                        <td><input type="hidden" name="s_id" value="${rewardsList.s_id}">${rewardsList.s_id}</td>
                    </tr>
                    <tr>
                        <td>金　　额:</td>
                        <td><input type="hidden" name="rw_salary" value="${rewardsList.rw_salary}">${rewardsList.rw_salary}</td>
                    </tr>
                    <tr>
                        <td>原　　因:</td>
                        <td><input type="hidden" name="r_reason" value="${rewardsList.r_reason}">${rewardsList.r_reason}</td>
                    </tr>
                    <tr>
                        <td>时　　间:</td>
                        <td><input type="hidden" name="r_date" value="${rewardsList.r_date}">${rewardsList.r_date}</td>
                    </tr>
                    <tr>
                        <td><a href="updateRewards?rw_id=${rewardsList.rw_id}">修　　改</a></td>
                        <td></td>
                    </tr>
                </c:forEach>
            </table>
        </form>
    </fieldset>
</div>
</body>
</html>

