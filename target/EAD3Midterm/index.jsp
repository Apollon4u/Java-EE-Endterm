<!DOCTYPE html>
<html>

<head>
    <title>Anime Catalog App</title>
</head>
<body>
    <nav>
        <a href="index.jsp">Anime</a>

        <ul>
            <li>
                <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
            </li>
        </ul>
        <ul>
            <li>
                <a href="register.jsp" class="nav-link">Sing Up</a>
            </li>
            <li>
                <a href="forward.jsp" class="nav-link">Sign In</a>
            </li>
        </ul>
    </nav>

    <div>
        <h1>Anime App</h1>
        <p><jsp:include page="include.jsp" /></p>
    </div>
</body>
</html>