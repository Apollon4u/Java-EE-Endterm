package org.example.midterm;

import org.example.midterm.db.DBConnection;
import org.example.midterm.exceptions.DateException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;

@WebServlet(value = "/updateAnime")
public class UpdateAnimeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Long animeId = Long.valueOf(request.getParameter("id"));
        String title =  request.getParameter("title");
        String releaseDate = request.getParameter("releaseDate");
        String isReleased = request.getParameter("isReleased");

        String userId = null;

        Cookie ck[] = request.getCookies();

        if (ck != null) {

            int  i = 0;

            while (!ck[i].getName().equals("userId")) {
                i++;
            }

            userId = ck[i].getValue();
        }

        try {
            if (!releaseDate.matches("^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$")) {
                throw new DateException("Incorrect date pattern");
            }

            PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement("UPDATE Anime SET title=?, releaseDate=?, isReleased=? WHERE  id=? and user_id=?");

            preparedStatement.setString(1, title);
            preparedStatement.setString(2, releaseDate);
            preparedStatement.setBoolean(3, Boolean.parseBoolean(isReleased));
            preparedStatement.setLong(4, animeId);
            preparedStatement.setLong(5, Long.parseLong(userId));

            preparedStatement.executeUpdate();

            request.setAttribute("message", "Anime has been successfully updated");
            request.getRequestDispatcher("update.jsp").include(request,response);

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
