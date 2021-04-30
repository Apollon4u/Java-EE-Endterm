package org.example.midterm;

import org.example.midterm.db.DBConnection;
import org.example.midterm.model.Anime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet(value = "/viewAnime")
public class ViewAnimeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Anime> animeList = new ArrayList<>();

        String userId = null;
        Cookie ck[] = request.getCookies();

        if (ck != null) {
            int index = 0;
            while (!ck[index].getName().equals("userId")) {
                index++;
            }
            userId = ck[index].getValue();
        }

        try {
            PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement("SELECT * FROM Anime WHERE user_id=? ORDER BY id");

            preparedStatement.setLong(1, Long.parseLong(userId));

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Anime anime = new Anime();

                anime.setId(resultSet.getLong("id"));
                anime.setTitle(resultSet.getString("title"));
                anime.setReleaseDate(resultSet.getString("releaseDate"));
                anime.setReleased(resultSet.getBoolean("isReleased"));

                animeList.add(anime);
            }

            request.setAttribute("AnimeList", animeList);
            request.getRequestDispatcher("viewMyAnime.jsp").include(request, response);

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}