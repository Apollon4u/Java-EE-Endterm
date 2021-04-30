<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<nav>
    <div>
        <a class="navbar-brand" href="index.jsp">Anime</a>

        <div>
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
        </div>
    </div>
</nav>

<div>
    <div>
        <form action="UserRegisterServlet" method="post" autocomplete="off">
            <h3>Sign Up</h3>
            <div>
                <label for="name">Name</label>
                <input id="name" type="text" class="form-control" placeholder="Enter name" name="name" required>
            </div>
            <div>
                <label for="password">Password</label>
                <input id="password" type="password" class="form-control" placeholder="Enter password" name="password" required>
            </div>
            <div>
                <label for="password2">Repeat Password</label>
                <input id="password2" type="password" class="form-control" placeholder="Repeat password" name="password2"
                       required>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</div>
</body>
</html>