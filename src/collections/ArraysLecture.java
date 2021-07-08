package collections;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysLecture {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);

//        System.out.println(Arrays.toString(setIntArray(new String[3])));
        String[] firstArray = getNameArray();

        System.out.println(Arrays.toString(firstArray));
    }

    public static int[] getIntArray(){
        return new int[]{1,2,3};
    }



    public static String[] setIntArray(String[] stringArray){
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("Please enter your first middle and last name ");
            stringArray[i] = sc.nextLine();
        }

        return stringArray;

    }

  public static String[] getNameArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your names, separated by a space: ");
        return sc.nextLine().split(" ");


  }




}
