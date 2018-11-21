<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/11/4
  Time: 13:40
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
    <title>员工转正</title>
</head>
<body>
<div style="padding-top: 5%;padding-left: 35%;padding-right: 35%">
    <fieldset style="padding-left: 20%;background: aquamarine">
        <legend>员工转正</legend><br/>
        <form action="updateaStaffServlet" method="post">
            <table>
                <tr>
                    <td>工　　号:</td>
                    <td><input type="text" name="s_id" id="s_id" required placeholder="请输入员工的工号"/></td>
                </tr>
                <tr>
                    <td>薪　　资:</td>
                    <td><input type="text" name="s_salary" id="s_salary" required placeholder="请输入转正的薪资"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td style="color: red">
                        ${requestScope.msg}
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="转　　正"></td>
                </tr>
            </table>
        </form>
    </fieldset>
</div>

</body>
</html>

