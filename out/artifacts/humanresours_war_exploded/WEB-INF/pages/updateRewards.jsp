<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/24
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
    <title>修改奖惩</title>
</head>
<body>
<div style="padding-top: 5%;padding-left: 35%;padding-right: 35%">
    <fieldset style="padding-left: 24%;background: aquamarine">
        <legend>修改奖惩</legend><br/>
        <form action="updateRewardsServlet" method="post">
            <table>
                    <tr>
                        <td></td>
                        <td><input type="hidden" name="rw_id" value="${requestScope.rewards.rw_id}"></td>
                    </tr>
                    <tr>
                        <td>工　　号:</td>
                        <td>${requestScope.rewards.s_id}</td>
                    </tr>
                    <tr>
                        <td>金　　额:</td>
                        <td><input type="text" name="rw_salary" value="${requestScope.rewards.rw_salary}"></td>
                    </tr>
                    <tr>
                        <td>原　　因:</td>
                        <td><input type="text" name="r_reason" value="${requestScope.rewards.r_reason}"></td>
                    </tr>
                    <tr>
                        <td>时　　间:</td>
                        <td>${requestScope.rewards.r_date}</td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="保　　存"></td>
                        <td></td>
                    </tr>
            </table>
        </form>
    </fieldset>
</div>
</body>
</html>

