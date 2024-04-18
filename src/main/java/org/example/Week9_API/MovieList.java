package org.example.Week9_API;

import static input.InputUtils.*;

public class MovieList {
    private static final String DB_PATH = "jdbc:sqlite:movie_watchlist.sqlite";
    private static Database database;

    public static void main(String[] args) {
        database = new Database(DB_PATH);
        addNewMovies();
    }
    public static void addNewMovies() {
        do {
            String movieName = stringInput("Enter the movie name");
            boolean movieWatched = yesNoInput("Have you seen this movie yet?");
            int movieStars = 0;
            if (movieWatched) {
                movieStars = positiveIntInput("What is your rating, in stars out of 5?");
            }
            Movie movie = new Movie(movieName, movieStars, movieWatched);
            database.addNewMovie(movie);
        } while (yesNoInput("Add a movie to the watchlist? "));
    }
}
