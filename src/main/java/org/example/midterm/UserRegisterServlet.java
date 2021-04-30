package org.example.midterm;

import org.example.midterm.db.DBConnection;
import org.example.midterm.exceptions.PasswordException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;

@WebServlet(value = "/register")
public class UserRegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String password2 = request.getParameter("password2");

        try {

            if (password.length() == 0) {
                throw new PasswordException("Incorrect password length");
            }

            if (!password.equals(password2)) {
                throw new PasswordException("Incorrect password repeating");
            }

            PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement("INSERT INTO Users(name, password)  VALUES (?,?)");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, password);
            preparedStatement.executeUpdate();

            request.getRequestDispatcher("login.jsp").include(request, response);

        } catch (SQLException | PasswordException exception) {
            exception.printStackTrace();
        }
    }
}
