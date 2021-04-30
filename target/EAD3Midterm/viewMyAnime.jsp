<%@include file="header.jsp"%>
<div class="text-left">
    <a href="${pageContext.request.contextPath}/addAnime.jsp"
       class="btn btn-success">Add Anime</a>
</div>
<table class="table table-striped">
    <thead>
    <tr>
        <th>Anime Id</th>
        <th>Anime title</th>
        <th>Anime release date</th>
        <th>Anime status</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="anime" items="${AnimeList}">
        <tr>
            <td><c:out value="${anime.id}"/></td>
            <td><c:out value="${anime.title}"/></td>
            <td><c:out value="${anime.releaseDate}"/></td>
            <td><c:out value="${anime.isReleased}"/></td>
            <td><a href="Update?id=<c:out value='${anime.id}' />">Edit</a>
                |
                <a href="Delete?id=<c:out value='${anime.id}'/>">Delete</a></td>
        </tr>

    </c:forEach>
    </tbody>
</table>

</body>
</html>
