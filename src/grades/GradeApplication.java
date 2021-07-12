package grades;

import java.util.Scanner;
import java.util.HashMap;

import util.Input;

public class GradeApplication {

    public static void main(String[] args) {

//        HashMap<String, String> usernames = new HashMap<>();
//        usernames.put("Ryan", "ryanorsinger");
//
//        System.out.println(usernames); // {Ryan=ryanorsinger}
//
//        usernames.putIfAbsent("Zach", "zgulde");
//        usernames.putIfAbsent("Zach", "coderdude24");
//        System.out.println(usernames); // {Ryan=ryanorsinger, Zach=zgulde}
//
//        usernames.remove("Zach");
//        System.out.println(usernames); // {Ryan=ryanorsinger}
//
//        usernames.replace("Ryan", "torvalds");
//        System.out.println(usernames); // {Ryan=torvalds}
//
//        usernames.clear();
//        usernames.isEmpty(); // true


        Student Christian = new Student("Christian");

        Christian.addGrade(85);
        Christian.addGrade(90);
        Christian.addGrade(100);

        Student Marina = new Student("Marina");

        Marina.addGrade(100);
        Marina.addGrade(95);
        Marina.addGrade(90);

        Student Theo = new Student("Theo");

        Theo.addGrade(85);
        Theo.addGrade(90);
        Theo.addGrade(70);

        Student Miyavi = new Student("Miyavi");

        Miyavi.addGrade(100);
        Miyavi.addGrade(97);
        Miyavi.addGrade(99);

        HashMap<String, Student> students = new HashMap<>();
        students.put("alpha", Christian);
        students.put("omega", Marina);
        students.put("beta", Theo);

//        System.out.println("The grade averages are ");
//        System.out.println("Christian: " + Christian.getGradeAverage());
//        System.out.println("Marina: " + Marina.getGradeAverage());
//        System.out.println("Miyavi: " + Miyavi.getGradeAverage());

        System.out.println("Welcome! \nHere are the github usernames of our students:");
        StringBuilder displayNames = new StringBuilder();
        for (int i = 0; i < students.size(); i++) {
            displayNames.append("|").append(students.keySet().toArray()[i]).append("| ");
        }
        String seeAnother;
        do {
            System.out.println("What student would you like to see more information on?");
            System.out.println(displayNames);
            Scanner sc = new Scanner(System.in);
            Input in = new Input(sc);
            String userInput = sc.nextLine();
            StringBuilder studentData = new StringBuilder("name,github_username,average\n");
            boolean pickedInput = students.containsKey(userInput);
            if (!pickedInput) {
                if (userInput.equalsIgnoreCase("all")) {
                    for (int i = 0; i < students.size(); i++) {
                        studentData.append(students.get(students.keySet().toArray()[i]).getName()).append(",");
                        studentData.append(students.keySet().toArray()[i]).append(",");
                        studentData.append(students.get(students.keySet().toArray()[i]).getGradeAverage()).append("\n");
                    }
                    System.out.println(studentData);
                } else {
                    System.out.println("Unable to find user with the github username of " + userInput + ".");
                }
            } else {
                System.out.println("Name: " + students.get(userInput).getName() + " - Github Username: " + userInput);
                System.out.format("Current Average: %.2f%n", students.get(userInput).getGradeAverage());
            }
            do {
                System.out.println("Would you like to see another student? \n[y/n]");
                seeAnother = sc.nextLine();
            } while ((!seeAnother.equalsIgnoreCase("y") && !seeAnother.equalsIgnoreCase("n") && !seeAnother.equalsIgnoreCase("no")));
        } while (seeAnother.equalsIgnoreCase("y"));
        System.out.println("Goodbye");
    }


}





