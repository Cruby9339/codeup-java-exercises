import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(addition(1,2));
        System.out.println(subtraction(5,2));
        System.out.println(multiplication(5,10));
        System.out.println(division(10,2));
        System.out.println(modulus(10, 2));

//        getInteger(1, 10);


//        System.out.println("Please enter an integer from 1 to 10");
//        int userInt = sc.nextInt();
//        System.out.println(factorial(userInt));

//        diceGame(sc);

    }

    public static int random(int maxNumber, int minNumber){
        return (int)(Math.random() * ((maxNumber-minNumber)+1) + minNumber);
    }


    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10: ");
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
            System.out.println("Correct");
            return userInput;

        } else {
            return getInteger(min, max);
        }
    }


    public static long factorial(int input) {
        long value = 1;
        for (int i = 1; i <= input; i++) {
            value *= i;
        }
        return value;
    }

    public static void diceGame(Scanner scan) {
        while (true) {

            System.out.println("Give me the number of sides of the dice");
            short n = Short.parseShort(scan.nextLine());
            int range = n - 1 + 1;
            System.out.println("Your dice roll 1 = " + ((int) (Math.random() * range) + 1));
            System.out.println("Your dice roll 1 = " + ((int) (Math.random() * range) + 1));

            System.out.println("Do you wish to continue? y/n");
            if (scan.nextLine().equalsIgnoreCase("n")) {
                break;


            }


        }
    }





}
