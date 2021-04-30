package org.example.midterm.db;

import java.sql.*;

public class DBConnection {

    public static Connection getConnection() {

        Connection connection = null;

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection( "jdbc:postgresql://localhost:5433/anime_catalog", "postgres", "12345");
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return connection;
    }
}
