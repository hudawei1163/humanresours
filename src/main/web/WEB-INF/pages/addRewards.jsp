<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/24
  Time: 16:10
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
    <title>增加奖惩</title>
</head>
<body>
<div style="padding-top: 5%;padding-left: 35%;padding-right: 35%">
    <fieldset style="padding-left: 24%;background: aquamarine">
        <legend>增加奖惩</legend><br/>
        <form action="addRewardsServlet" method="post">
            <table>
                <tr>
                    <td>工　　号:</td>
                    <td><input type="text" name="s_id" id="s_id"required/></td>
                </tr>
                <tr>
                    <td>金　　额:</td>
                    <td><input type="text" name="rw_salary" id="rw_salary"required/></td>
                </tr>
                <tr>
                    <td>原　　因:</td>
                    <td><input type="text" name="r_reason" id="r_reason"required/></td>
                </tr>
                <tr>
                    <td>时　　间:</td>
                    <td>
                        <jsp:useBean id="now" class="java.util.Date" scope="page"/>
                        <fmt:formatDate var="now" value="${now}" pattern="yyyy-MM-dd"/>
                        ${now}
                        <input type="hidden" name="r_date" value="${now}">
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td style="color: red">
                        ${requestScope.msg}
                    </td>
                </tr>
                <tr>
                    <td><input type="submit" value="增　　加"></td>
                    <td>
                        <a href="admin">返回</a>
                    </td>
                </tr>
            </table>
        </form>
    </fieldset>
</div>
</body>
</html>

