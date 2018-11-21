<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/23
  Time: 10:22
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
    <title>用户查看自己的简历</title>
</head>
<body>
<a href="user">返回</a>
<fieldset style="padding-left: 10%;background: pink">
    <legend>查看简历</legend><br/>
    <form action="" method="post">
            <table>
                <c:forEach items="${requestScope.resumes}" var="resumes" varStatus="loop">
                <tr>
                    <td></td>
                    <td><input type="hidden" name="r_id" id="r_id"value="${resumes.r_id}"/></td>
                </tr>
                <tr>
                    <td>简　　历:</td>
                    <td>${resumes.r_name}</td>
                </tr>
                <tr>
                    <td>姓　　名:</td>
                    <td>${resumes.u_name}</td>
                </tr>
                <tr>
                   <td>学　　历:</td>
                   <td>${resumes.r_education}</td>
                </tr>
                <tr>
                    <td>性　　别:</td>
                    <td>${resumes.r_sex}</td>
                </tr>
                <tr>
                    <td>籍　　贯:</td>
                    <td>${resumes.r_birthplace}</td>
                </tr>
                <tr>
                    <td>手　　机:</td>
                    <td>${resumes.r_phone}</td>
                </tr>
                <tr>
                    <td>邮　　箱:</td>
                    <td>${resumes.r_mail}</td>
                </tr>
                <tr>
                    <td>出生日期:</td>
                    <td>${resumes.r_birthdate}</td>
                </tr>
                <tr>
                    <td>政治面貌:</td>
                    <td>${resumes.r_status}</td>
                </tr>
                <tr>
                    <td>证件号码:</td>
                    <td>${resumes.r_idNumber}</td>
                </tr>
                <tr>
                    <td>现居住地:</td>
                    <td>${resumes.r_abode}</td>
                </tr>
                <tr>
                    <td>求职意向:</td>
                    <td>${resumes.r_jobIntention}</td>
                </tr>
                <tr>
                    <td>工作经验:</td>
                    <td>${resumes.r_workExperience}</td>
                </tr>
                 <tr>
                     <td>是否投递:</td>
                     <td>${resumes.r_deliver}</td>
                 </tr>
                <tr>
                    <td style="color: red">${requestScope.msg}</td>
                    <td></td>
                </tr>

                <tr>
                    <td><a href="updateResume?r_id=${resumes.r_id}">修　　改</a></td>
                    <td><a href="deleteResumeServlet?r_id=${resumes.r_id}">删　　除</a></td>
                </tr>
                    <tr>
                        <td><a href="deliverResumeServlet?r_id=${resumes.r_id}">投递简历</a></td>
                        <td></td>
                    </tr>
                </c:forEach>
        </table>
    </form>
</fieldset>
</body>
</html>

