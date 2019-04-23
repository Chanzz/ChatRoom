<%--<jsp:forward page="/chat"></jsp:forward>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
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
<script type="text/javascript">
    //页面加载完成后，发送一个ajax请求
    $(function () {
        $.ajax({
            url:"${APP_PATH}/chat",
            type:"GET",
            success:function (result) {
                console.log(result);
            }
        });
    });
</script>
</body>
</html>