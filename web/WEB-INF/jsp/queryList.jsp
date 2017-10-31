<%--
  Created by IntelliJ IDEA.
  User: YangJing
  Date: 2017/10/31
  Time: 9:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html;charset=utf-8">
    <title>所有课程列表</title>
</head>
<body>
<div id="all">
    <form action="<c:url value="/findAll.action"/>">
        <table width="100%" border="1">
            <tr>
                <td width="30%">课程名</td>
                <td width="15%">教师名</td>
                <td width="50%">上课时间</td>
                <td width="5%">操作</td>
            </tr>
            <c:forEach items="${list}" var="item">
                <tr>
                    <td>${item.course.name}</td>
                    <td>${item.teacher.name}</td>
                    <td>${item.time}</td>
                    <td>修改</td>
                </tr>
            </c:forEach>
        </table>
        <br/>
        <center><input type="submit" value="刷新"></center>
    </form>
</div>

</body>
</html>
