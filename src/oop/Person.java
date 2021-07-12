package oop;

public class Person {

    //Class Members


    //field
    //private means only members
    private String name;
    private int age;
    private String height;
    private String nationality;


    //constructor
    public Person(String name, int age, String height, String nationality) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.nationality = nationality;
    }

    public Person(){

    }

    public Person(String fullName) {
    }

    //properties
    //command n for creating getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getEntertainment(String entertainment){
        return this.name + " is going to go" + entertainment;
        //Christian is going to ride a rollercoaster
    }

}
