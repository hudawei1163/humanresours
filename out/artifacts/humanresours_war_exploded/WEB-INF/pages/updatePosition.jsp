<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/24
  Time: 14:46
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
    <title>修改职位</title>
</head>
<body>
<div style="padding-top: 5%;padding-left: 35%;padding-right: 35%">
    <fieldset style="padding-left: 20%;background: aquamarine">
        <legend>增加部门</legend><br/>
        <form action="updatePositionServlet" method="post">
            <table>
                <tr>
                    <input type="hidden" name="p_id" value="${requestScope.position.p_id}"/>
                </tr>
                <tr>
                    <td>名　　称</td>
                </tr>
                <tr>
                    <td><input type="text" name="p_name" id="p_name"required/></td>
                </tr>
                <tr>
                    <td style="color: red">
                        ${requestScope.msg}
                    </td>
                </tr>
                <tr>
                    <td><input type="submit" value="修　　改"></td>
                    <td><a href="admin">返回</a></td>
                </tr>
            </table>
        </form>
    </fieldset>
</div>
</body>
</html>

