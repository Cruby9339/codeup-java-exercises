package movies;
import util.Input;
import java.util.Arrays;
import java.util.Scanner;


public class MoviesApplication {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie[] theList = MoviesArray.findAll();
        String exit = "";
        do {
            chooseCategory(theList, sc);
            System.out.println("Type 'exit' to exit application or type 'other' to explore another category \n Enter [exit/other]");
            exit = sc.nextLine();
        } while (!exit.equalsIgnoreCase("exit"));
    }


    private static void chooseCategory(Movie[] moviesArray, Scanner scanner){
        System.out.println("Would you like to see all movies or by category? \n Enter [all/drama/musical/scifi/horror/comedy/animated]");
        String userInput = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < moviesArray.length; i++) {
            String pickMovie = moviesArray[i].getCategory();
            if(userInput.equalsIgnoreCase("all")) {
                System.out.println(moviesArray[i].getName());
                count += 1;
            } else if(pickMovie.equalsIgnoreCase(userInput)){
                System.out.println(moviesArray[i].getName());
                count += 1;
            }
        }
        if (count == 0) {
            System.out.println("no movies for that category");
        }
    }


}
