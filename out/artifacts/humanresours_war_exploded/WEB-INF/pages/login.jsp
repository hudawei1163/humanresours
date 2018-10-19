<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/9/5
  Time: 22:56
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
    <title>登录界面</title>
</head>
<body>
<div style="padding-top: 5%;padding-left: 35%;padding-right: 35%">
<fieldset style="padding-left: 20%;background: aquamarine">
<legend>用户登陆</legend><br/>
<form action="/loginServlet" method="post">
    <table>
        <tr>
            <td>用户名:</td>
            <td><input type="text" name="name" id="name" required placeholder="会员名/邮箱/手机号码"/></td>
        </tr>
        <tr>
            <td>密　码:</td>
            <td><input type="text" name="pass" id="pass" required placeholder="6-20字母、数字或符号"/></td>
        </tr>
        <tr>
            <td></td>
            <td style="color: red">
                ${requestScope.msg}
            </td>
        </tr>
        <tr>
            <td></td>
            <td><input type="checkbox" name="log">记住密码</td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="登　　录"><span style="padding-left: 14%"><input type="button"onclick="location='register'"name="register" value="注　　册"></span></td>
        </tr>
        <tr>
            <td></td>
            <td><a href="ShowAllGoodServlet">自动登陆</a><span style="padding-left: 20% "><a href="login.jsp">找回密码</a></span></td>
        </tr>
    </table>
</form>
</fieldset>
</div>
</body>
</html>

