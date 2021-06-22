import java.util.Scanner;

public class ConsoleIO {

    public static void main(String[] args) {

//        System.out.printf("My Name is Christian.");
//        System.out.printf("new line");
//
//        String name = "Christian";
//        String age = "28";
//
//        String mySentence = String.format("My name is %s and I am %s year's old", name, age);
//
//        System.out.println(mySentence);

//        float currencyInPennies = 1000.1299999f;
//
//        String mySentence = String.format("I'll sell you swamp land for $%.2f per acre", currencyInPennies);
//
//        System.out.printf(mySentence);


        Scanner sc = new Scanner(System.in);

//        System.out.println("What is your full name?");
//        String firstName = sc.next();
//        String lastName = sc.next();
//        System.out.printf("Your first name is: %s\n", firstName);
//        System.out.printf("Your last name is: %s\n", lastName);

//        System.out.println("What month and year were you born?");
//        String month = sc.next();
//        String year = sc.next();
//        System.out.printf("The month you were born in is: %s\n", month);
//        System.out.printf("The year you were born in is: %s\n", year);
//
//        System.out.println(month);

//        System.out.println("Enter a number: ");
//        int myNum = sc.nextInt();
//        System.out.println(myNum);

            while (sc.hasNext()){
                String word = sc.next();
                System.out.println(word);
            }




    }

}
