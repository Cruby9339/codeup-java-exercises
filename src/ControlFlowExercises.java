import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

//        int i = 5;
//
//        while(i <= 15){
//            System.out.println(i);
//            i++;
//        }


//        int i = 0;
//        do{
//            System.out.println(i);
//            i += 2;
//        }while(i <= 100);


//        int i = 100;
//        do{
//            System.out.println(i);
//            i -= 5;
//        }while(i >= -10);

//        long i = 2;

//        do{
//            System.out.println(i);
//            i *= i;
//        }while(i < 1000000);

//        for (long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }


//        int i = 1;
//
//        do{
//            if(i % 15 == 0){
//                System.out.println("FizzBuzz");
//            }else if(i % 3 == 0){
//                System.out.println("Fizz");
//            }else if(i % 5 == 0){
//                System.out.println("Buzz");
//            }else{
//                System.out.println(i);
//            }
//            i ++;
//        } while (i <= 100);


        Scanner sc = new Scanner(System.in);
//        String willContinue;
//        int maxInteger;
//        do {
//            System.out.println("Please enter an integer");
//            maxInteger = sc.nextInt();
//            System.out.println("do you want to continue?");
//            System.out.println("[y/n]");
//            willContinue = sc.next();
//        } while (!willContinue.equals("y"));
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        for (int i = 1; i <= maxInteger; i++) {
//            int square = i * i;
//            int cubed = i * i * i;
//            System.out.printf("%s      | %s       | %s%n", i, square, cubed);
//        }

        int grade;
        String willContinue;
        do{
            System.out.println("Please enter a grade from 0-100");
            grade = sc.nextInt();
            System.out.println("do you want to continue?");
            System.out.println("[y/n]");
            willContinue = sc.next();
        }while(!willContinue.equals("y"));
        if(grade >= 88){
            System.out.println("Your grade is an A!");
        }else if(grade >= 80){
            System.out.println("Your grade is a B!");
        }else if(grade >= 67){
            System.out.println("Your grade is a C!");
        }else if(grade >= 60){
            System.out.println("Your grade is a D!");
        }else {
            System.out.println("Your grade is an F :(");
        }



    }

}
