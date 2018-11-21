<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/11/4
  Time: 22:00
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
    <title>我的薪资</title>
</head>
<body>
<a href="staff">返回</a>
<div style="padding-top: 5%;padding-left: 35%;padding-right: 35%">
    <fieldset style="padding-left: 24%;background: aquamarine">
        <legend>结算薪资</legend><br/>
        <form action="addSalaryServlet" method="post">
            <table>
                <c:forEach items="${requestScope.salaries}" var="salaries" varStatus="loop">
                    <tr>
                        <td>工　　号:</td>
                        <td>${salaries.s_id}</td>
                    </tr>
                    <tr>
                        <td>底　　薪:</td>
                        <td>${salaries.s_wage}</td>
                    </tr>
                    <tr>
                        <td>罚　　款:</td>
                        <td>${salaries.s_fine}</td>
                    </tr>
                    <tr>
                        <td>奖　　惩:</td>
                        <td>${salaries.s_prize}</td>
                    </tr>
                    <tr>
                        <td>总　　计:</td>
                        <td>${salaries.s_salarys}</td>
                    </tr>
                    <tr>
                        <td>月　　份:</td>
                        <td>${salaries.s_month}</td>
                    </tr>
                    <tr>
                        <td>结算时间:</td>
                        <td>${salaries.s_time}</td>
                    </tr>
                </c:forEach>
            </table>
        </form>
    </fieldset>
</div>
</body>
</html>

