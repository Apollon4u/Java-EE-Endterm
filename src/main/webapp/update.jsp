<%@include file="header.jsp"%>

<h3>Update an anime</h3>
<form action="updateAnime" method="post" align="center">
    <c:if test="${Anime != null}">
        <input type="hidden" name="id" value="<c:out value='${Anime.id}' />" />
    </c:if>
    <label for="title">Anime Title</label>
    <input type="text"  value="<c:out value='${Anime.title}'/>" class="" placeholder="Enter the title" name="title" id="title"><br>
    <label for="releaseDate"><abbr title="release date">Release Date</abbr></label>
    <input type="text" value="<c:out value='${Anime.releaseDate}'/>" class="" placeholder="DD/MM/YYYY" name="releaseDate" id="releaseDate" align="right"><br>
    <label for="isReleased">Anime status</label>
    <input type="text" value="<c:out value='${Anime.isReleased}'/>" class="" placeholder="false or true" name="isReleased" id="isReleased"><br>
    <button type="submit" name="action" value="update">Update</button>
    <br>
    <p><c:out value="${message}"/></p>
</form>
</body>
</html>