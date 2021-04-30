<%@include file="header.jsp"%>

<div>
    <% String name = (String)request.getAttribute("userName");%>
    <%! String message = "  Welcome To Anime Catalog System"; %>
    <h1><%= name == null ? "" : name %> <% out.print(message);%></h1><br>
</div>

</body>
</html>
