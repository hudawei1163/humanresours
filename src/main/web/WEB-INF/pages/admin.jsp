<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/19
  Time: 15:49
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
    <title>管理员页面</title>
</head>
<body>
<a href="addRecruitServlet">填写招聘信息</a>
<a href="updateRecruitServlet">修改招聘信息</a>
<a href="deleteRecruitServlet">删除招聘信息</a>
<a href="queryResumeServlet">查看已投简历</a>
收取简历-->查阅简历-->做标记（是否已阅）-->通知面试、并记录面试时间-->
通知安排员工进行面试-->录用(动态的将简历信息取出并存入员工数据表)
<a href="">部门增删改查</a>
<a href="">职位增删改查</a>
<a href="">员工增删改查</a>
<a href="">考勤查</a>
<a href="">薪资增删改查</a>
<a href="">培训增删改查</a>
<a href="">奖惩增改查</a>
</body>
</html>

