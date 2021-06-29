import java.util.Scanner;
import java.lang.Math;


public class HighLow {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int random_int = (int) Math.floor(Math.random() * (100 + 1) + 0);


        System.out.println("I wanna play a game...Please enter a number to begin.");
        int userGuess = sc.nextInt();

        do {
            if (userGuess > random_int) {
                System.out.println("LOWER");
                System.out.println("Enter a new number");
                userGuess = sc.nextInt();
            } else if (userGuess < random_int) {
                System.out.println("HIGHER");
                System.out.println("Enter a new number");
                userGuess = sc.nextInt();
            }


        } while (userGuess != random_int);
        System.out.println("GOOD GUESS!");

    }


}
