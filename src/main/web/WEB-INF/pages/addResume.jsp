<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/10/19
  Time: 16:18
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
    <title>填写简历</title>
</head>
<body>
<div style="padding-top: 5%;padding-left: 35%;padding-right: 35%">
    <fieldset style="padding-left: 20%;background: yellow">
        <legend>个人简历</legend><br/>
        <form action="addResumeServlet" method="post">
            <table>
                <tr>
                    <td>简　　历:</td>
                    <td><input type="text" name="r_name" id="r_name"/></td>
                </tr>
                <tr>
                    <td>姓　　名:</td>
                    <td><input type="text" name="u_name" id="u_name"/></td>
                </tr>
                <tr>
                    <td>学　　历:</td>
                    <td><input type="text" name="r_education" id="r_education"/></td>
                </tr>
                <tr>
                    <td>性　　别:</td>
                    <td>
                        <input type="radio" name="r_sex" id="nan" value="男"/>男　　　
                        <input type="radio" name="r_sex" id="nv" value="女"/>女
                    </td>
                </tr>
                <tr>
                    <td>籍　　贯:</td>
                    <td><input type="text" name="r_birthplace" id="r_birthplace"/></td>
                </tr>
                <tr>
                    <td>手　　机:</td>
                    <td>
                        <input type="text" name="r_phone" id="r_phone"required placeholder="请输入常用的手机号"/>
                    </td>
                </tr>
                <tr>
                    <td>邮　　箱:</td>
                    <td>
                        <input type="text" name="r_mail" id="r_mail"required placeholder="请输入有效的邮箱号"/>
                    </td>
                </tr>
                <tr>
                    <td>出生日期:</td>
                    <td>
                        <input type="text" name="r_birthdate" id="r_birthdate"/>
                    </td>
                </tr>
                <tr>
                    <td>政治面貌:</td>
                    <td>
                        <input type="text" name="r_status" id="r_status"/>
                    </td>
                </tr>
                <tr>
                    <td>证件号码:</td>
                    <td>
                        <input type="text" name="r_idNumber" id="r_idNumber"/>
                    </td>
                </tr>
                <tr>
                    <td>现居住地:</td>
                    <td>
                        <input type="text" name="r_abode" id="r_abode"/>
                    </td>
                </tr>
                <tr>
                    <td>求职意向:</td>
                    <td>
                        <input type="text" name="r_jobIntention" id="r_jobIntention"/>
                    </td>
                </tr>
                <tr>
                    <td>工作经验:</td>
                    <td>
                        <input type="text" name="r_workExperience" id="r_workExperience"/>
                    </td>
                </tr>
                <tr>
                    <td style="color: red">
                    ${requestScope.msg}
                    </td>
                    <td><a href="user">返回</a></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" name="register" value="保　　存"><span style="padding-left: 14%"><input type="reset" value="重　　置"></span></td>
                </tr>
            </table>
        </form>
    </fieldset>
</div>
</body>
</html>

