package warmup;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> vacay = new ArrayList<>();
        vacay.add("Tokyo");
        vacay.add("Canyon Lake");
        vacay.add("Comal River");

        System.out.println(vacay);

        System.out.println("Enter a vacation spot: ");

       String name = sc.nextLine();
       vacay.add(name);

        System.out.println(vacay);

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
//        }


    }











}
