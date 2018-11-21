<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/19
  Time: 12:32
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
    <title>主页</title>
    <style>
        a{
            color: darkslateblue;
            text-decoration:none;
        }
        td{
            text-align: center;
            vertical-align: middle;
        }
        h1{
            color: blueviolet;
            margin-left: 38%;
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
<body bgcolor="#1e90ff">
<a href="staffLogin">员工登录</a>
<c:if test="${sessionScope.user == null}">
    | <a href="login" class="a">亲,请登录</a>
    | <a href="register">免费注册</a>
</c:if>
<hr>
<h1>上海海同信息科技有限公司</h1>
<hr>
<img src="photo/1.jpg" width="100%" height="70%">
<hr>
<%--<c:if test="${sessionScope.user != null}">
    ${"★欢迎"+sessionScope.user.name+"用户★"}
</c:if>--%>
<p class="footer">版权所有 <a href="http://www.zhizuobiao.com" target="_blank">职坐标</a>-一站式<a href="http://www.zhizuobiao.com" target="_blank">IT培训</a>就业服务领导者 沪ICP备13042190号-4</p>
<p class="footer1">上海<a href="http://www.zhizuobiao.com" target="_blank">海同信息</a>科技有限公司 Copyright ©2015 www.zhizuobiao.com，All Rights Reserved.</p>
<p class="footer2"><a href="http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=31011502005948"  target="_blank">沪公网安备 31011502005948号</a></p>
</body>
</html>

