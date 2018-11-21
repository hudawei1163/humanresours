<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/28
  Time: 0:28
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
    <title>用户改密</title>
</head>
<body>
<div style="padding-top: 5%;padding-left: 35%;padding-right: 35%">
    <fieldset style="padding-left: 20%;background: aquamarine">
        <legend>用户改密</legend><br/>
        <form action="updateUserServlet" method="post">
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
                    <td>确认密码:</td>
                    <td><input type="text" name="pass1" id="pass1" required placeholder="再次输入密码"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td style="color: red">
                        ${requestScope.msg}
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="修　　改"></td>
                </tr>
            </table>
        </form>
    </fieldset>
</div>
</body>
</html>

