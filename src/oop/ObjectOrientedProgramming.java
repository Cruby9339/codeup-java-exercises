package oop;

public class ObjectOrientedProgramming {

    public static void main(String[] args) {
        // tell me about a person in the main method
        Person person = new Person();
        person.setName("Christian");

        Person person1 = new Person();
        person1.setName("Christian");
        System.out.println(person1.getEntertainment(" ride rollercoaster"));

        Person person2 = new Person();
        person2.setAge(28);
        System.out.println(person2.getAge());
    }

}
