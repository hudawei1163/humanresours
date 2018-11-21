<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/24
  Time: 14:21
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
    <title>修改简历</title>
</head>
<body>
<a href="user">返回</a>
<fieldset style="padding-left: 10%;background: pink">
    <legend>修改简历</legend><br/>
    <form action="updateResumeServlet" method="post">
        <table>
                <tr>
                    <td></td>
                    <td><input type="hidden" name="r_id" id="r_id"value="${resume.r_id}"/></td>
                </tr>
                <tr>
                    <td>简　　历:</td>
                    <td><input type="text" name="r_name" id="r_name"value="${resume.r_name}"/></td>
                </tr>
                <tr>
                    <td>姓　　名:</td>
                    <td><input type="text" name="u_name" id="u_name"value="${resume.u_name}"/></td>
                </tr>
                <tr>
                    <td>学　　历:</td>
                    <td><input type="text" name="r_education" id="r_education"value="${resume.r_education}"/></td>
                </tr>
                <tr>
                    <td>性　　别:</td>
                    <td><input type="text" name="r_sex" id="r_sex"value="${resume.r_sex}"/></td>
                </tr>
                <tr>
                    <td>籍　　贯:</td>
                    <td><input type="text" name="r_birthplace" id="r_birthplace"value="${resume.r_birthplace}"/></td>
                </tr>
                <tr>
                    <td>手　　机:</td>
                    <td>
                        <input type="text" name="r_phone" id="r_phone"value="${resume.r_phone}"/>
                    </td>
                </tr>
                <tr>
                    <td>邮　　箱:</td>
                    <td>
                        <input type="text" name="r_mail" id="r_mail"value="${resume.r_mail}"/>
                    </td>
                </tr>
                <tr>
                    <td>出生日期:</td>
                    <td>
                        <input type="text" name="r_birthdate" id="r_birthdate"value="${resume.r_birthdate}"/>
                    </td>
                </tr>
                <tr>
                    <td>政治面貌:</td>
                    <td>
                        <input type="text" name="r_status" id="r_status"value="${resume.r_status}"/>
                    </td>
                </tr>
                <tr>
                    <td>证件号码:</td>
                    <td>
                        <input type="text" name="r_idNumber" id="r_idNumber"value="${resume.r_idNumber}"/>
                    </td>
                </tr>
                <tr>
                    <td>现居住地:</td>
                    <td>
                        <input type="text" name="r_abode" id="r_abode"value="${resume.r_abode}"/>
                    </td>
                </tr>
                <tr>
                    <td>求职意向:</td>
                    <td>
                        <input type="text" name="r_jobIntention" id="r_jobIntention"value="${resume.r_jobIntention}"/>
                    </td>
                </tr>
                <tr>
                    <td>工作经验:</td>
                    <td>
                        <input type="text" name="r_workExperience" id="r_workExperience"value="${resume.r_workExperience}"/>
                    </td>
                </tr>
                <tr>
                    <td style="color: red">
                            ${requestScope.msg}
                    </td>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" name="updateResume" value="保　　存"></td>
                </tr>

        </table>
    </form>
</fieldset>
</body>
</html>

