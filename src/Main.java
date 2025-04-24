import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static Scanner scanner; // Note: Do not change this line.

    public static void manageMovies() {}

    public static void main(String[] args) throws IOException {
        String path = args[0];

        scanner = new Scanner(new File(path));
        int numberOfTests = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numberOfTests; i++) {
            System.out.println("Test number " + i + " starts.");
            try {
                manageMovies();
            } catch(Exception e){
                System.out.println("Exception " + e);
            }
            System.out.println("Test number " + i + " ended.");
            System.out.println("-----------------------------------------------");
        }
        System.out.println("All tests have ended.");
    }
}



public class Movie {
    private String name;
    private double rating;
    private Directors director;

    public Movie(double rating, String name, Directors director) {


    }
}
public class Directors {
    private String director;
    private Double rating;
    private int num_movies;

    public Directors(String director, Double rating) {
        this.director = director;
        this.rating = rating;
        num_movies++;
    }

}

public class App {
    private static Movie[] array_movies = new Movie[100];
    private static Directors[] array_directors = new Directors[100];
    private static int movie_counter;
    private static int director_counter;

    public void Add_Movie(String director, String movie_name, double movie_rating) {
        if (director_counter == array_directors.length) {
            System.out.println("Movies limit reached.");
        }
        if (movie_counter == array_directors.length) {
            System.out.println("Movies limit reached.");
        }
        if ((movie_rating > 10) || (movie_rating < 0)) {
        }
    }
        public void Best_Director {
            if (movie_counter == 0){
                System.out.println("No movies are available");
                return;
            }
            int max_director_index = 0;
            for (i = 0; i < director_counter; i++){
                if(array_directors[i].DirectorRating() >
                        array_directors[max_director_index].DirectorRating()){
                    max_director_index = i;
                }
            }
            System.out.println("Best director: " + array_directors[max_director_index].DirectorName() +
                    "with an average rating of: " + array_directors[max_director_index].DirectorRating());
        }
}