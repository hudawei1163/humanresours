<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/24
  Time: 16:21
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
    <title>修改薪资</title>
</head>
<body>
<a href="admin">返回</a>
<div style="padding-top: 5%;padding-left: 35%;padding-right: 35%">
<fieldset style="padding-left: 24%;background: aquamarine">
<legend>修改薪资</legend><br/>
<form action="updateSalaryServlet" method="post">
<table>
    <tr>
    <td></td>
    <td><input type="hidden" name="sl_id" value="${salary.sl_id}"/></td>
    </tr>
    <tr>
    <td>工　　号:</td>
    <td>${salary.s_id}</td>
    </tr>
    <tr>
    <td>底　　薪:</td>
    <td><input type="text" name="s_wage" value="${salary.s_wage}"/></td>
    </tr>
    <tr>
    <td>罚　　款:</td>
    <td><input type="text" name="s_fine" value="${salary.s_fine}"></td>
    </tr>
    <tr>
    <td>奖　　惩:</td>
    <td><input type="text" name="s_prize" value="${salary.s_prize}"/></td>
    </tr>
    <tr>
    <td>总　　计:</td>
    <td><input type="text" name="s_salarys" value="${salary.s_salarys}"/></td>
    </tr>
    <tr>
    <td>月　　份:</td>
    <td>${salary.s_month}</td>
    </tr>
    <tr>
    <td>结算时间:</td>
    <td>${salary.s_time}</td>
    </tr>
    <tr>
    <td></td>
    <td style="color: red">
    ${requestScope.msg}
    </td>
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

