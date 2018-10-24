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
</head>
<body>
<fieldset style="padding-left: 10%;background: pink">
    <legend>招聘信息</legend><br/>
    <form action="addRecruitServlet" method="post">
        <table>
            <tr>
                <input type="button"value="投递简历"/>
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

发布按钮
<a href="admin.jsp">返回</a>
</body>
</html>

