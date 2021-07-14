package warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        ArrayList<String> vacay = new ArrayList<>();
//        vacay.add("Tokyo");
//        vacay.add("Canyon Lake");
//        vacay.add("Comal River");
//
//        System.out.println(vacay);
//
//        System.out.println("Enter a vacation spot: ");
//
//       String name = sc.nextLine();
//       vacay.add(name);
//
//        System.out.println(vacay);

//        String input;
//
//        System.out.println("Enter the Input String");
//
//        input=sc.nextLine();
//
//        int count=0;
//
//        StringTokenizer st= new StringTokenizer(input, " "); // Space as delimiter
//
//        while(st.hasMoreTokens())
//
//        {
//
//            count++;
//
//            System.out.println(count+" : "+st.nextToken());
//
//      }

//        System.out.println("Please enter a string");
//        String aString = sc.nextLine();
//
//        returnString(aString);


        canBank();


    }


    public static void canBank() {
        Scanner sc = new Scanner(System.in);

//        try {
//            System.out.println("Please enter your age and how much you can deposit");
//            int userAge = sc.nextInt();
//            int userBalance = sc.nextInt();
//            if (userAge > 16 && userBalance > 200) {
//                System.out.println("Here's your new account!");
//            }
//        } catch (InputMismatchException ex) {
//            System.out.println("This is NAN");
//            System.out.println(ex.getMessage());
//        } catch (NumberFormatException e){
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("this will always run");
//        }


        String s = "Oberon is the best cohort ever!";
        int l = (int)(Math.random()*s.length());
        char ch = s.charAt(l);
        System.out.println(ch);




    }


    public static void returnString(String userString) {
        String[] splitStr = userString.split("\\s+");
        System.out.println(Arrays.toString(splitStr));
    }


}
