import java.awt.print.Pageable;
import java.util.Scanner;

public class StringsLecture {


//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        String[] studentsArr =
//                {"Amado", "Christian", "Christopher", "Corey", "Demetrio",
//                        "Diamond", "Erik", "Grady", "Jesse", "Joshua",
//                        "Juan", "Mitchell", "Moses", "Nathan", "Prachi",
//                        "Raul", "Ricardo", "Richard", "Robert", "Sam",
//                        "Sean", "Stephen", "Tiffanny", "Wagner", "Laura",
//                        "Casey", "Dorian", "Tristan", "Jordy"};
//        int randomNum = (int) (Math.random() * 28);
//        String randomName = studentsArr[randomNum];
//
//        System.out.println("Please enter a name");
//
//        String userString = sc.next();
//
//        if(userString.equals(randomName)){
//            System.out.format("Woah you guessed: %s", userString);
//        }else{
//            System.out.format("boo, wrong name %s", userString);
//        }

//        System.out.println(teamName("Spurs"));

//        System.out.println(countString(teamName("Spurs")));
//
//        System.out.println(helloName("Christian", "Ruby"));


//        System.out.println("Please enter a name");
////        int age = sc.nextInt();
//        String name = sc.nextLine();
//
//        userQuestion(name);
//    }

//    public static String teamName(String name){
//        return String.format("%s is the best team!", name);
//    }
//
//
//    public static int countString(String name){
//        return name.length();
//    }
//
//    public static String helloName(String first, String last){
//        return String.format("Hello %s %s", first, last);
//    }

    //    WARMUP
//    TODO: prompt a user to tell us about themselves (age, name, if
//     they have any pets (true/false). Using method overloading, create
//     methods that will return the first fact they told us about
//     themselves. ex: I can input: 18 -- Laura -- false in which case I
//     expect you to return: 18. but if I tell you my name first: Laura --
//     false -- 18. I expect you to return "Laura" ... etc.



//
//    public static void userQuestion(int age){
//
//        if(age == 28){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }
//
//    }
//
//    public static void userQuestion(String name){
//        if(name.equals("Christian")){
//            System.out.println("Correct");
//        }else{
//            System.out.println("Incorrect");
//        }
//    }


//    TODO: you are a sports manager. Prompt your client who is training
//     for a marathon how many miles they have to run today. You're the
//     coach, so you decide how many miles they ran that day. create a method that takes in how many miles that have left in training and simulate that they check in with you after every 2 miles. print out
//     how many miles they have left in training until they have 0 miles
//     left.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many miles have you ran today?");

        int userMiles = sc.nextInt();

        checkMiles(userMiles);
        System.out.println("No more miles left");
    }

    public static void checkMiles(int miles){
        if(miles > 0){
            System.out.printf("You still have %s miles left!\n", miles);
            miles -= 2;

            System.out.printf("Miles: %s\n", miles);
            checkMiles(miles);
        }
    }


}
