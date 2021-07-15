package util;
import java.util.Scanner;


public class Input {

    private Scanner sc = new Scanner(System.in);


    private String newString = "This is a string";

    public Input(Scanner scanner){
        this.sc = scanner;
    }

    public String getString() {
        return sc.nextLine();
    }

    public boolean yesNo() {
        String input = getString();
        return (input.equalsIgnoreCase("y")||input.equalsIgnoreCase("yes"));
    }


    public int getInt(){
        int userInput;
        try {
            userInput = Integer.parseInt(sc.nextLine());
        } catch(NumberFormatException e){
            System.out.println("not an integer. Please try again.");
            return getInt();
        }
        return userInput;
    }
    public int getInt(int min, int max){
        int userInput;
        do{
            System.out.println("Please enter a value between " + min + " and " + max);
            userInput = getInt();
        } while (min >= userInput || max <= userInput);
        return userInput;
    }


    public double getDouble(double min, double max){
        double userInput;
        do{
            System.out.println("Please enter a value between " + min + " and " + max);
            userInput = getDouble();
        } while (min >= userInput || max <= userInput);
        return userInput;
    }

    public double getDouble(){
        double userInput;
        try {
            userInput = Double.parseDouble(sc.nextLine());
        } catch(NumberFormatException e){
            System.out.println("Invalid. Please try again.");
            return getInt();
        }
        return userInput;
    }


}
