package collections;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsLecture {

    public static void main(String[] args) {
//        ArrayList<String> stringArr = new ArrayList<>();
//
//        stringArr.add("Christian");
//        System.out.printf("Current ArrayList size: %s\n", stringArr.size());
//        System.out.println(stringArr);
//        System.out.println(stringArr.hashCode());
//
//
//        stringArr.add("Marina");
//        System.out.printf("Current ArrayList size: %s\n", stringArr.size());
//        System.out.println(stringArr);
//        System.out.println(stringArr.hashCode());
//
//

        ArrayList<Person> peopleList = new ArrayList<>();

        peopleList.add(new Person("Christian Ruby"));
        peopleList.add(new Person("Marina Arriola"));
        peopleList.add(new Person("Miyavi"));







    }

    public void printListDetails(ArrayList<Person> peopleList){
        int counter = 0;
        for(Person person: peopleList) {
            System.out.println("Current Iteration: " + counter);

        }
    }

}
