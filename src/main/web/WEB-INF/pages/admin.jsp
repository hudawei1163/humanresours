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
    <style>
        select{
            width: 120px;
            height: 30px;
        }
        /*div{
            margin-left: 4%;
        }*/
        h2{
            color: indigo;
            margin-left: 46%;
        }
        .footer{
            margin-left: 34%;
        }
        .footer1{
            margin-left: 29%;
        }
        .footer2{
            margin-left: 44%;
        }
    </style>
</head>
<body bgcolor="#6495ed">
<h2>管　理　员</h2>
<hr>
<div>
   <a href="../../index.jsp">首页</a>
    　<select id="recruit" name="recruit"onChange="location.replace(this.options[this.selectedIndex].getAttribute('data-href'))">
    <option>招聘管理</option>
    <option value="0" data-href="addRecruit">填写招聘信息</option>
    <option value="1" data-href="adminQueryRecruitServlet">查看招聘信息</option>
    </select>

    　<select id="resume" name="resume"onChange="location.replace(this.options[this.selectedIndex].getAttribute('data-href'))">
    <option>简历管理</option>
    <option value="0" data-href="queryResumeServlet">查看简历</option>
</select>

    　<select id="interview" name="interview"onChange="location.replace(this.options[this.selectedIndex].getAttribute('data-href'))">
    <option>面试管理</option>
    <option value="0" data-href="queryInterviewServlet">查看面试</option>
</select>

    　<select id="department" name="department"onChange="location.replace(this.options[this.selectedIndex].getAttribute('data-href'))">
    <option>部门管理</option>
    <option value="0" data-href="addDepartment">增加部门</option>
    <option value="1" data-href="queryDepartmentServlet">查看部门</option>
</select>

    　<select id="position" name="position"onChange="location.replace(this.options[this.selectedIndex].getAttribute('data-href'))">
    <option>职位管理</option>
    <option value="0" data-href="queryDepartmentAddServlet">增加职位</option>
    <option value="1" data-href="queryPositionServlet">查看职位</option>
</select>

    　<select id="staff" name="staff"onChange="location.replace(this.options[this.selectedIndex].getAttribute('data-href'))">
    <option>员工管理</option>
    <option value="1" data-href="updateaStaff">员工转正</option>
    <option value="2" data-href="updateStaffGuard">员工换岗</option>
    <option value="3" data-href="updatebStaff">员工离职</option>
    <option value="4" data-href="queryAllStaff">查看员工</option>
</select>

    　<select id="cultivate" name="cultivate"onChange="location.replace(this.options[this.selectedIndex].getAttribute('data-href'))">
    <option>培训管理</option>
    <option value="0" data-href="addCultivate">增加培训</option>
    <option value="1" data-href="queryCultivateServlet">查看培训</option>
</select>

    　<select id="attendance" name="attendance"onChange="location.replace(this.options[this.selectedIndex].getAttribute('data-href'))">
    <option>考勤管理</option>
    <option value="0" data-href="queryAllAttendanceServlet">查看考勤</option>
</select>

    　<select id="rewards" name="rewards"onChange="location.replace(this.options[this.selectedIndex].getAttribute('data-href'))">
    <option>奖惩管理</option>
    <option value="0" data-href="addRewards">增加奖惩</option>
    <option value="1" data-href="queryAllRewardsServlet">查看奖惩</option>
</select>

    　<select id="salary" name="salary"onChange="location.replace(this.options[this.selectedIndex].getAttribute('data-href'))">
    <option>薪资管理</option>
    <option value="0" data-href="addSalary">结算薪资</option>
    <option value="1" data-href="queryAllSalaryServlet">查看薪资</option>
</select>
</div>
<hr>
<img src="photo/c1.jpg" width="100%" height="70%">
<hr>
    <p class="footer">版权所有 <a href="http://www.zhizuobiao.com" target="_blank">职坐标</a>-一站式<a href="http://www.zhizuobiao.com" target="_blank">IT培训</a>就业服务领导者 沪ICP备13042190号-4</p>
    <p class="footer1">上海<a href="http://www.zhizuobiao.com" target="_blank">海同信息</a>科技有限公司 Copyright ©2015 www.zhizuobiao.com，All Rights Reserved.</p>
    <p class="footer2"><a href="http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=31011502005948"  target="_blank">沪公网安备 31011502005948号</a></p>
</body>
</html>

