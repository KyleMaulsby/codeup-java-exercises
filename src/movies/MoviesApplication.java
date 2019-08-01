package movies;
import java.util.Arrays;
import java.util.Scanner;

import static movies.MoviesArray.findAll;

public class MoviesApplication {
    public static void main(String[] args) {
        int count = 1;
        Movie[] newMovies = findAll();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("What would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category");
            String input = scanner.nextLine();
            switch (input) {
                case "0":
                    break;
                case "1":
                    System.out.println(Arrays.toString(newMovies));
                case "2":
                case "3":
                case "4":
                case "5":
                default:
                    break;
            }
        }while(count == 1);
    }
}
