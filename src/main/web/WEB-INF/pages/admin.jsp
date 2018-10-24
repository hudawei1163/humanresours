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
<a href="addRecruit">填写招聘信息</a>
<a href="updateRecruit">修改招聘信息</a>
<a href="deleteRecruitServlet">删除招聘信息</a>
<a href="queryRecruitServlet">查看招聘信息</a>

<a href="queryResumeServlet">查看已投简历</a>

<a href="addInterview">邀请面试</a>
<a href="updateInterview">修改面试</a>
<a href="deleteInterviewServlet">删除面试</a>
<a href="queryInterviewServlet">查看面试游客</a>

<a href="addDepartment">增加部门</a>
<a href="updateDepartment">修改部门</a>
<a href="deleteDepartmentServlet">删除部门</a>
<a href="queryDepartmentServlet">查看部门</a>

<a href="addPosition">增加职位</a>
<a href="updatePosition">修改职位</a>
<a href="deletePositionServlet">删除职位</a>
<a href="queryPositionServlet">查看职位</a>

<a href="addStaff">增加员工</a>
<a href="updateStaff">修改员工</a>
<a href="queryStaffServlet">查看员工</a>

<a href="queryAttendanceServlet">考勤查</a>

<a href="">薪资增删改查</a>
<a href="addSalary">增加薪资</a>
<a href="updateSalary">修改薪资</a>
<a href="deleteSalaryServlet">删除薪资</a>
<a href="querySalaryServlet">查看薪资</a>

<a href="">培训增删改查</a>
<a href="addCultivate">增加培训</a>
<a href="updateCultivate">修改培训</a>
<a href="deleteCultivateServlet">删除培训</a>
<a href="queryCultivateServlet">查看培训</a>

<a href="">奖惩增改查</a>
<a href="addRewards">增加奖惩</a>
<a href="updateRewards">修改奖惩</a>
<a href="queryRewardsServlet">查看奖惩</a>

</body>
</html>

