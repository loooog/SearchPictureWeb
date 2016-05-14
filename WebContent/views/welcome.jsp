<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>学生学籍管理系统</title>
    <link rel="stylesheet" href="/SearchPictureWeb/static/css/style.css"/>
    <script src="/SearchPictureWeb/static/jquery-1.11.2.js"></script>
    <script src="/SearchPictureWeb/static/js/app.js" type="text/javascript"></script>
</head>
<body>
    <div class="box">
        <div class="title">
            <h4>学生学籍管理系统</h4>
        </div>

        <div class="link link-teacher">
            <span class="icon"></span>
            <a href="${pageContext.request.contextPath}/test/register.do" class="button" data-title="teacher's login">
                <span class="line line-top"></span>
                <span class="line line-right"></span>
                <span class="line line-bottom"></span>
                <span class="line line-left"></span>
                教师登录
            </a>
        </div>

        <div class="link link-student">
            <span class="icon"></span>
            <a href="${pageContext.request.contextPath}/test/loginPage.do"" class="button" data-title="student's login">
                <span class="line line-top"></span>
                <span class="line line-right"></span>
                <span class="line line-bottom"></span>
                <span class="line line-left"></span>
                学生登录
            </a>
        </div>

        <div class="tip">
            <em class="tipContent"></em>
            <span class="tipCorner"></span>
        </div>
    </div>
</body>
</html>