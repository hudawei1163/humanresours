<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/23
  Time: 1:29
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
    <title>员工主页</title>
    <style>
        select{
            width: 120px;
            height: 30px;
        }
        div{
            margin-left: 18%;
        }
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
<h2>员　　　工</h2>
<hr>
<input type="hidden" name="staff" value="${sessionScope.staff}"/>
<div>
    <a href="../../index.jsp">首页</a>
　<select id="AllStaff" name="AllStaff"onChange="location.replace(this.options[this.selectedIndex].getAttribute('data-href'))">
    <option>我的同事</option>
    <option value="0" data-href="queryAllStaff">查看员工</option>
</select>

　<select id="attendance" name="attendance"onChange="location.replace(this.options[this.selectedIndex].getAttribute('data-href'))">
    <option>我的考勤</option>
    <option value="0" data-href="addAttendance">考勤打卡</option>
    <option value="1" data-href="queryAttendanceServlet">考勤记录</option>
</select>

　<select id="salary" name="salary"onChange="location.replace(this.options[this.selectedIndex].getAttribute('data-href'))">
    <option>我的薪资</option>
    <option value="0" data-href="querySalaryServlet">查看薪资</option>
</select>

　<select id="cultivate" name="cultivate"onChange="location.replace(this.options[this.selectedIndex].getAttribute('data-href'))">
    <option>我的培训</option>
    <option value="0" data-href="queryMyCultivateServlet">查看培训</option>
</select>

　<select id="rewards" name="rewards"onChange="location.replace(this.options[this.selectedIndex].getAttribute('data-href'))">
    <option>我的奖惩</option>
    <option value="0" data-href="queryRewardsServlet">查看奖惩</option>
</select>

    　<select id="staff" name="staff"onChange="location.replace(this.options[this.selectedIndex].getAttribute('data-href'))">
        <option>个人信息</option>
        <option value="0" data-href="updateStaff">修改密码</option>
    </select>
</div>
<hr>
<img src="photo/a1.jpg" width="100%" height="70%">
<hr>
<p class="footer">版权所有 <a href="http://www.zhizuobiao.com" target="_blank">职坐标</a>-一站式<a href="http://www.zhizuobiao.com" target="_blank">IT培训</a>就业服务领导者 沪ICP备13042190号-4</p>
<p class="footer1">上海<a href="http://www.zhizuobiao.com" target="_blank">海同信息</a>科技有限公司 Copyright ©2015 www.zhizuobiao.com，All Rights Reserved.</p>
<p class="footer2"><a href="http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=31011502005948"  target="_blank">沪公网安备 31011502005948号</a></p>
</body>
</html>

