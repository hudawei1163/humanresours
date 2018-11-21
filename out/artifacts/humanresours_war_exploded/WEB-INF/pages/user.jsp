<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/26
  Time: 13:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head bgcolor="#6495ed">
    <base href="<%=basePath%>"/>
    <title>用户中心</title>
    <style>
        select{
            width: 120px;
            height: 30px;
        }
        h2{
            color: indigo;
            margin-left: 46%;
        }
        div{
            margin-left: 28%;
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
<h2>用　　　户</h2>
<hr>
<div>
    <a href="../../index.jsp">首页</a>
    　<select id="recruit" name="recruit"onChange="location.replace(this.options[this.selectedIndex].getAttribute('data-href'))">
    <option>我的招聘</option>
    <option value="0" data-href="queryRecruitServlet">招聘信息</option>
</select>

　<select id="resume" name="resume"onChange="location.replace(this.options[this.selectedIndex].getAttribute('data-href'))">
    <option>我的简历</option>
    <option value="0" data-href="addResume">填写简历</option>
    <option value="1" data-href="queryUserResumeServlet">查看简历</option>
</select>

　<select id="interview" name="interview"onChange="location.replace(this.options[this.selectedIndex].getAttribute('data-href'))">
    <option>我的面试</option>
    <option value="3" data-href="queryMyInterviewServlet">查看面试</option>
</select>
    　<select id="user" name="user"onChange="location.replace(this.options[this.selectedIndex].getAttribute('data-href'))">
    <option>个人信息</option>
    <option value="0" data-href="updateUser">修改密码</option>
</select>
</div>
<hr>
<img src="photo/b1.jpg" width="100%" height="70%">
<hr>
<p class="footer">版权所有 <a href="http://www.zhizuobiao.com" target="_blank">职坐标</a>-一站式<a href="http://www.zhizuobiao.com" target="_blank">IT培训</a>就业服务领导者 沪ICP备13042190号-4</p>
<p class="footer1">上海<a href="http://www.zhizuobiao.com" target="_blank">海同信息</a>科技有限公司 Copyright ©2015 www.zhizuobiao.com，All Rights Reserved.</p>
<p class="footer2"><a href="http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=31011502005948"  target="_blank">沪公网安备 31011502005948号</a></p>
</body>
</html>

