<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/24
  Time: 16:24
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
    <title>增加培训</title>
</head>
<body>
<a href="admin">返回</a>
<fieldset style="padding-left: 10%;background: pink">
    <legend>增加培训</legend><br/>
    <form action="addCultivateServlet" method="post">
        <table>
            <tr>
                <td>工　　号:</td>
                <td><input type="text" name="s_id" id="s_id"required/></td>
            </tr>
            <tr>
                <td>主　　题:</td>
                <td><input type="text" name="c_theme" id="c_theme"required/></td>
            </tr>
            <tr>
                <td>开始时间:</td>
                <td><input type="datetime-local" name="c_start_time"/></td>
            </tr>
            <tr>
                <td>结束时间:</td>
                <td><input type="datetime-local" name="c_end_time"/></td>
            </tr>
            <tr>
                <td>地　　址:</td>
                <td><input type="text" name="c_address" id="c_address"required/></td>
            </tr>
            <tr>
                <td style="color: red">${requestScope.msg}</td>
                <td></td>
            </tr>
            <tr>
                <td><input type="submit"value="添　　加"/></td>
                <td></td>
            </tr>
        </table>
    </form>
</fieldset>
</body>
</html>

