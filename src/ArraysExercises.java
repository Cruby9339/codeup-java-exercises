import collections.Person;

import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {



        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);

        Person[] people = new Person[3];
        people[0] = new Person("Christian");
        people[1] = new Person("Marina");
        people[2] = new Person("Miyavi");
        Person addedPerson = new Person("Theo");

        for (Person person : people) {
            System.out.println(person.getName());
        }
        Person[] evenMorePeople = addPerson(people, addedPerson);

        for (Person evenMorePerson : evenMorePeople) {
            System.out.println(evenMorePerson.getName());
        }






    }

    public static Person[] addPerson(Person[] personArray, Person newPerson){
        Person[] morePeople = Arrays.copyOf(personArray, personArray.length + 1);
        morePeople[morePeople.length-1] = newPerson;
        return morePeople;
    }


}
