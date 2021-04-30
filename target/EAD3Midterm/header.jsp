<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title> Anime App </title>

    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<nav>
    <div>
        <a href="dashboard.jsp" class="navbar-brand">Dashboard</a>
    </div>
    <div>
        <ul>
            <li><a href="viewAnime">View My Anime</a></li>
        </ul>
        <ul>
            <li><a href="logout">Logout</a></li>
        </ul>
    </div>
</nav>