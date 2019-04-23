<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<%--上面那句很重要--%>
<html>
<head>
    <title>Chat Room</title>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
    <script type="text/javascript" src="${APP_PATH}/static/jquery/jquery-3.3.1.js"></script>
    <link href="${APP_PATH}/static/bootsrap/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="${APP_PATH}/static/bootsrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <h1>聊天室</h1>
        </div>
    </div>
    <div class="row"></div>
    <c:forEach items="${mes}" var="emp">
        <p>${emp.mId}：${emp.mWord}</p>
    </c:forEach>
    <div class="row"></div>
</div>
</body>
</html>
