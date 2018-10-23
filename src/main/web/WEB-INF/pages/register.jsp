<%@ page import="com.iotek.model.User" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/9/5
  Time: 22:57
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
    <title>用户注册</title>
    <script>
    $(function () {
        $("input[name='register']").click(function () {
            $ajax({
                type:"post",
                url:"registerServlet",
                data:{name:$("input[name='name']").val(),pass:$("input[name='pass']").val()},
                success:function (obj) {
                    alert("注册成功");
                },
                error:function (obj) {
                    alert("注册失败");
                }
            })
        })
    })
    </script>
</head>
<body>
<div class="header">
    <div class="inner clearFloat">
        <h1 class="logo"><a href="//www.51job.com/" target="_blank" title="前程无忧"><img src="//img01.51jobcdn.com/im/images/2016/careerpost/sem/images/logo.png" width="99" height="41" alt="前程无忧"></a></h1>
        <h2 class="subLogo"><img src="//img01.51jobcdn.com/im/images/2016/careerpost/sem/images/subLogo.png" width="339" height="18" alt=""></h2>
    </div>
</div>

<div style="padding-top: 5%;padding-left: 35%;padding-right: 35%">
    <fieldset style="padding-left: 20%;background: pink">
        <legend>用户注册</legend><br/>
<form action="registerServlet" method="post">
    <table>
        <tr>
            <td>账　　号:</td>
            <td><input type="text" name="name" id="name" required placeholder="会员名/邮箱/手机号码"/></td>
        </tr>
        <tr>
            <td>密　　码:</td>
            <td><input type="text" name="pass" id="pass"required placeholder="6-20字母、数字或符号"/></td>
        </tr>
        <tr>
            <td>确认密码:</td>
            <td><input type="text" name="pass1" id="pass1"required placeholder="请再次输入密码"/></td>
        </tr>
        <tr>
            <td>性　　别:</td>
            <td>
                <input type="radio" name="sex" id="nan"/>男　　　
                <input type="radio" name="sex" id="nv"/>女
            </td>
        </tr>
        <tr>
            <td>手机号码:</td>
            <td>
                <input type="text" name="phone" id="phone"required placeholder="请输入常用的手机号"/>
            </td>
        </tr>
        <tr>
            <td></td>
            <td style="color: red">
                <%=(request.getAttribute("msg") == null ? "" : request.getAttribute("msg"))%>
            </td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" name="register" value="注　　册"><span style="padding-left: 14%"><input type="reset" value="重　　置"></span></td>
        </tr>
    </table>
</form>
    </fieldset>
</div>
</body>
</html>

