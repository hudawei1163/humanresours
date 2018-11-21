<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/23
  Time: 0:37
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
    <title>添加招聘信息</title>
    <style>
        td{
            text-align:center;
        }
    </style>
</head>
<body>
<fieldset style="padding-left: 10%;background: aquamarine">
    <legend>招聘信息</legend><br/>
    <form action="addRecruitServlet" method="post">
        <table>
                <td>职　　位</td>
                <td>学　　历</td>
                <td>人　　数</td>
                <td>薪　　资</td>
                <td>工作经验</td>
                <td>工作地点</td>
                <td>发布日期</td>
            </tr>
            <tr>
                <td>
                    <select id="positions" name="positions">
                        <c:forEach items="${requestScope.positions}" var="position">
                            <option>${position.p_name}</option>
                        </c:forEach>
                    </select>
                </td>
                <td><input type="text" name="r_education" id="r_education"required/></td>
                <td><input type="text" name="r_peopleNumber" id="r_peopleNumber"required/></td>
                <td><input type="text" name="r_salary" id="r_salary"required/></td>
                <td><input type="text" name="r_workExperience" id="r_workExperience"required/></td>
                <td><input type="text" name="r_workplace" id="r_workplace"required/></td>
                <td>
                <jsp:useBean id="now" class="java.util.Date" scope="page"/>
                    <fmt:formatDate var="now" value="${now}" pattern="yyyy-MM-dd"/>
                    ${now}
                    <input type="hidden" name="r_date" value="${now}">
                </td>
            </tr>
            <tr>
                <td style="color: red">${requestScope.msg}</td>
            </tr>
            <tr>
                <td><input type="submit" value="发　　布"></td>
                <td><a href="admin">返回</a></td>
            </tr>
        </table>


    </form>
</fieldset>

</body>
</html>

