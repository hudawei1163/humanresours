<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/25
  Time: 13:38
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
    <title>员工登录</title>
</head>
<body>
<div style="padding-top: 5%;padding-left: 35%;padding-right: 35%">
    <fieldset style="padding-left: 20%;background: aquamarine">
        <legend>员工登录</legend><br/>
        <form action="staffLoginServlet" method="post">
            <table>
                <tr>
                    <td>账　号:</td>
                    <td><input type="text" name="name" id="name" required placeholder="请输入员工的工号"/></td>
                </tr>
                <tr>
                    <td>密　码:</td>
                    <td><input type="text" name="pass" id="pass" required placeholder="默认为手机号请尽快修改"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td style="color: red">
                        ${requestScope.msg}
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="登　　录"></td>
                </tr>
            </table>
        </form>
    </fieldset>
</div>
</body>
</html>

