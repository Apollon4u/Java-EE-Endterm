<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<nav>
    <a class="navbar-brand" href="index.jsp">Anime</a>

    <ul class="navbar-nav mr-auto">
        <li class="nav-item active">
            <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
        </li>
    </ul>
    <ul class="navbar-nav">
        <li class="nav-item">
            <a href="register.jsp" class="nav-link">Sing Up</a>
        </li>
        <li class="nav-item">
            <a href="login.jsp" class="nav-link">Sign In</a>
        </li>
    </ul>
</nav>

<form action="UserLoginServlet" method="post" autocomplete="off">
    <h3 class="text-center">Sign In</h3>
    <c:if test="${!message.isEmpty()}">
        <p class="font-weight-bold"><c:out value="${message}"/></p>
    </c:if>
    <div>
        <label for="name">Name</label>
        <input id="name" type="text" class="form-control" placeholder="Enter name" name="name" required>
    </div>
    <div>
        <label for="password">Password</label>
        <input id="password" type="password" class="form-control" placeholder="Enter password" name="password" required>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>

</body>
</html>