<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/24
  Time: 14:45
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
    <title>增加职位</title>
    <style>
        td{
            text-align:center;
        }
    </style>
</head>
<body>
<div style="padding-top: 5%;padding-left: 35%;padding-right: 35%">
    <fieldset style="padding-left: 24%;background: aquamarine">
        <legend>增加职位</legend><br/>
        <form action="addPositionServlet" method="post">
            <table>
                <tr>
                    <td>选择部门</td>
                    <td>职位名称</td>
                </tr>
                <tr>
                    <td>
                        <select id="departments" name="departments">
                        <c:forEach items="${requestScope.departments}" var="department">
                            <option>${department.d_name}</option>
                        </c:forEach>
                        </select>
                    </td>
                    <td><input type="text" name="p_name" id="p_name"required/></td>
                </tr>
                <tr>
                    <td></td>
                    <td style="color: red">
                        ${requestScope.msg}
                    </td>
                </tr>
                <tr>
                    <td><input type="submit" value="创　　建"></td>
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

