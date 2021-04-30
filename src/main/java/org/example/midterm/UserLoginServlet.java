package org.example.midterm;

import org.example.midterm.db.DBConnection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;

@WebServlet(value = "/login")
public class UserLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userName = "";
        String userPassword = "";
        Long userId = Long.valueOf(-1);

        String name = request.getParameter("name");
        String password = request.getParameter("password");

        try {

            PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement("SELECT * FROM Users WHERE name=? and password=?");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                userId = resultSet.getLong("id");
                userName = resultSet.getString("name");
                userPassword = resultSet.getString("password");
            }

            if (name.equals(userName) && password.equals(userPassword)) {
                Cookie ck = new Cookie("userId", String.valueOf(userId));
                ck.setMaxAge(60 * 30);
                response.addCookie(ck);

                request.setAttribute("userName", userName);
                request.getRequestDispatcher("dashboard.jsp").include(request, response);
            } else {
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
                requestDispatcher.include(request, response);
            }

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("index.jsp");
    }
}
