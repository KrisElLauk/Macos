package io.codelex.classesandobjects.practice.Exercise_4;

public class Movie {
    
    private String movie;
    private String studio;
    private String rating;

    public Movie(String movie, String studio, String rating) {
        this.movie = movie;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String movie, String studio) {
        this.movie = movie;
        this.studio = studio;
        rating = "PG";
    }

    public Movie[] getPG(Movie[] movie) {
        Movie[] pgMovie = new Movie[movie.length];

        int arrayIndex = 0;
        for (int i = 0; i < movie.length; i++) {
            if (movie[i].rating.equals("PG")) {
                pgMovie[arrayIndex] = movie[i];
                arrayIndex += arrayIndex;
            }
        }
        return pgMovie;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movie='" + movie + '\'' +
                ", studio='" + studio + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Movie movie1 = new Movie("Casing Royale", "Eon Productions", "PG13");
        Movie movie2 = new Movie("Glass", "Buena Vista", "PG13");
        Movie movie3 = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures", "PG");

        System.out.println(movie1.toString());
        System.out.println(movie2.toString());
        System.out.println(movie3.toString());

    }
}
