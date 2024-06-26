package org.example.Week9_API;

import javax.xml.crypto.Data;
import java.sql.*;

public class Database {
    private String databasePath;
    Database(String databasePath) {
        this.databasePath = databasePath;
        try (Connection connection = DriverManager.getConnection(databasePath);
             Statement statement = connection.createStatement()) {
             statement.execute("CREATE TABLE IF NOT EXISTS" + "movies (name text, stars INTEGER, watched BOOLEAN)");
        } catch (SQLException e) {
            System.out.println("Error creating movie DB table because " + e);
        }
    }
    public void addNewMovie(Movie movie) {
        String insertSQL = "INSERT INTO movies VALUES (?,?,?)";
        try (Connection connection = DriverManager.getConnection(databasePath); PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            preparedStatement.setString(1, movie.getName());
            preparedStatement.setString(2, movie.getStars());
            preparedStatement.setBoolean(3,movie.isWatched());
        } catch (SQLException e) {
            System.out.println("Error adding movie " + movie + " because " + e);
        }

    }

}
