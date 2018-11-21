<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/11/4
  Time: 23:56
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
    <title>Title</title>
    <style>
        select{
            width: 120px;
            height: 30px;
        }
        td{
            text-align:center;
        }
    </style>
    <script src="../../resource/jquery/jquery-3.2.1.js"></script>
    <script>
        $(document).ready(function () {
            $.ajax({
                url: "queryAllDepartmentServlet",
                type: "get",
                dataType: "json", //以json的形式返回，易解析 "json",
                async: false,
                success: function (departmentList) {
                    $("#department").empty();// jq写法 清除部门下拉框的所有内容，然后拼接上从后台取出来的数据
                    $("<option value=''>--请选择--</option>").appendTo("#department");
                    for (var i = 0; i < departmentList.length; i++) {//获取departmentList里面的数据，拼接到select上
                        $("#department").append("<option value='" + departmentList[i].d_id + "'>" + departmentList[i].d_name + "</option>");
                    }
                },
            });
            $("#department").change(function () {
                $("#position").empty();// jq写法 清除职位下拉框的所有内容，然后拼接上从后台取出来的数据
                $("<option value=''>--请选择--</option>").appendTo("#position");
                $("#staff").empty();
                $("<option value=''>--请选择--</option>").appendTo("#staff");
                $.ajax({
                    url: "queryAllPositionServlet",
                    type: "get",
                    data: {"d_id": $("#department").val()},
                    dataType: "json",
                    async: false,
                    success: function (positionList) {
                        for (var i = 0; i < positionList.length; i++) {//获取positionList里面的数据，拼接到select上
                            $("#position").append("<option value='" + positionList[i].p_id + "'>" + positionList[i].p_name + "</option>");
                        }
                    },
                });
            });
        });
    </script>
</head>
<body>
<fieldset style="padding-left: 10%;background: pink">
    <legend>员工换岗</legend><br/>
    <form action="updateStaffGuard1Servlet" method="post">
        <table>
            <tr>
                <td><input type="hidden" name="s_id" value="${requestScope.s_id}"></td>
            </tr>
            <tr>
                <td>
                    <select id="department">
                        <option name="d_id" value="d_id">--部　门--</option>
                    </select>
                    <select id="position" name="p_id">
                        <option >--职　位--</option>
                    </select>
                </td>
                <td><input type="submit" value="确　定"></td>
            </tr>
        </table>
    </form>
</fieldset>
</body>
</html>

