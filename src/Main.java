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

public void Best_Director {
    if (movie_counter == 0){
            println("No movies are available");
            return;
        }
    int max_director_index = 0;
    for (i = 0; i < array_directors.length(); i++){
            if(array_directors[i].DirectorRating() >
                array_directors[max_director_index].DirectorRating()){
                max_director_index = i;
            }
        }
    println("Best director: " + array_directors[max_director_index].DirectorName() +
            "with an average rating of: " + array_directors[max_director_index].DirectorRating());
}