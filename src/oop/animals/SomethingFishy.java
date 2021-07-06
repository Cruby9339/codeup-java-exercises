package oop.animals;

public class SomethingFishy {

    public static void main(String[] args) {



//        System.out.println(marineAnimal.getName());

        var marineAnimal = new AquaMammal("Blue Whale");

        System.out.println(((AquaMammal) marineAnimal).getMaxTimeSubmerged());



    }

}
