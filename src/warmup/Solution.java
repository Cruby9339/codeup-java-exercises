package warmup;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
//        Parent saySomething = new Parent();
//        saySomething.SayHello();
//
//        Subclass saySomething2 = new Subclass();
//        saySomething2.imTheSub();

        Scanner sc = new Scanner(System.in);
//        System.out.println("Give me a string ");
//        String input=keyboard.nextLine();
//
//        int upperCase = 0;
//
//        for (int i = 0; i < input.length(); i++) {
//            if (Character.isUpperCase(input.charAt(i)))
//                upperCase++;
//        }
//
//        System.out.printf("There are %s uppercase letters.",upperCase);


//        int numOne = Integer.parseInt("5");
//        int numTwo = Integer.parseInt("6");
        System.out.println("Please enter 2 numbers");
        int numOne = sc.nextInt();
        int numTwo = sc.nextInt();
        String operator = sc.nextLine();


        add(numOne, numTwo);
        subtract(numOne, numTwo);
        multiply(numOne, numTwo);
        divide(numOne, numTwo);



    }






    public static void add(int numOne, int numTwo) {
        int result = numOne + numTwo;
        System.out.println(numOne + " + " + numTwo + " = " + result);
    }

    public static void subtract(int numOne, int numTwo) {
        int result = numOne - numTwo;
        System.out.println(numOne + " - " + numTwo + " = " + result);
    }

    public static void multiply(int numOne, int numTwo) {
        int result = numOne * numTwo;
        System.out.println(numOne + " * " + numTwo + " = " + result);
    }

    public static void divide(int numOne, int numTwo) {
        int result = numOne / numTwo;
        System.out.println(numOne + " / " + numTwo + " = " + result);
    }




}
