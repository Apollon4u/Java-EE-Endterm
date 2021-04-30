<%@include file="header.jsp"%>

<h3>Add an anime</h3>
<form action="addAnime" method="post" align="center">
    <label for="title">Anime Title</label>
    <input type="text" class="" placeholder="Enter the title" name="title" id="title"><br>
    <label for="releaseDate"><abbr title="Release date">Release Date</abbr></label>
    <input type="text" class="" placeholder="DD/MM/YYYY" name="releaseDate" id="releaseDate" align="right"><br>
    <label for="isReleased">Anime status</label>
    <input type="text" class="" placeholder="false or true" name="isReleased" id="isReleased"><br>
    <button type="submit" name="action" value="update">Add</button>
    <br>
    <p><c:out value="${message}"/></p>
</form>

</body>
</html>
