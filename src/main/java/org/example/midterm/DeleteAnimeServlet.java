package org.example.midterm;

import org.example.midterm.db.DBConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;

@WebServlet(value = "/deleteAnime")
public class DeleteAnimeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Long id = Long.valueOf(request.getParameter("id"));

        Connection connection = DBConnection.getConnection();

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
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM Anime WHERE id=? and user_id=?");

            preparedStatement.setLong(1, id);
            preparedStatement.setLong(2, Long.parseLong(userId));

            preparedStatement.executeUpdate();

            request.getRequestDispatcher("ViewAnimeServlet").include(request,response);

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
