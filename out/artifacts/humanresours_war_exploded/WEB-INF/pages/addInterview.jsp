<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/24
  Time: 15:08
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
    <title>增加面试</title>
</head>
<body>
<a href="admin">返回</a>

<fieldset style="padding-left: 10%;background: pink">
    <legend>邀请面试</legend><br/>
    <form action="addInterviewServlet" method="post">
        <table>
                <tr>
                    <td><input type="hidden" name="r_id" id="r_id"value="${requestScope.r_id}"/></td>
                </tr>
                <tr>
                    <td><input type="hidden" name="u_id" id="u_id"value="${requestScope.u_id}"/></td>
                </tr>
                <tr>
                    <td>姓　　名:</td>
                    <td><input type="hidden" name="u_name" id="u_name"value="${requestScope.u_name}"/>${requestScope.u_name}</td>
                </tr>
                <tr>
                    <td>手　　机:</td>
                    <td><input type="hidden" name="r_phone" id="r_phone"value="${requestScope.r_phone}"/>${requestScope.r_phone}</td>
                </tr>
                <tr>
                    <td>职　　位:</td>
                    <td>
                        <select id="positions" name="p_name">
                            <c:forEach items="${requestScope.positions}" var="position">
                                <option value="${position.p_name}">${position.p_name}</option>
                            </c:forEach>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>面试时间:</td>
                    <td><input type="datetime-local" name="i_date"/></td>
                </tr>
                <tr>
                    <td style="color: red">${requestScope.msg}</td>
                    <td></td>
                </tr>
                <tr>
                    <td><input type="submit"value="邀请面试"/></td>
                    <td></td>
                </tr>
        </table>
    </form>
</fieldset>
</body>
</html>

