<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/19
  Time: 13:49
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
    <title>用户查看招聘信息</title>
</head>
<body>
<a href="../../index.jsp">首页</a>
<a href="writerResume">填写简历</a>
<fieldset style="padding-left: 10%;background: pink">
    <legend>招聘信息</legend><br/>
    <form action="applyPositionServlet" method="post">
        <table>
            <tr>
                <input type="button"value="申请职位"/>
            </tr>
            <tr>
                <td>职　　位</td>
                <td>学　　历</td>
                <td>人　　数</td>
                <td>薪　　资</td>
                <td>工作经验</td>
                <td>工作地点</td>
                <td>发布日期</td>
            </tr>
            <tr>
                <td><input type="text" name="p_id" id="p_id"/></td>
                <td><input type="text" name="r_education" id="r_education"/></td>
                <td><input type="text" name="r_peopleNumber" id="r_peopleNumber"/></td>
                <td><input type="text" name="r_salary" id="r_salary"/></td>
                <td><input type="text" name="r_workExperience" id="r_workExperience"/></td>
                <td><input type="text" name="r_workplace" id="r_workplace"/></td>
                <td><input type="text" name="r_date" id="r_date"/></td>
            </tr>
        </table>
    </form>
</fieldset>
</body>
</html>

