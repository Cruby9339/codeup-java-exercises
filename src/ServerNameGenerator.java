import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {
        String[] adjectives = {"beautiful", "fast", "smart", "feminine", "athletic", "collaborative", "cool", "considerate", "wise", "mature"};
        String[] nouns = {"dog", "girl", "racket", "ball", "sidewalk", "screen", "rainbow", "water", "universe", "air"};
        System.out.println("Here is your server name: ");
        System.out.println(randomElement(adjectives) + "-" + randomElement(nouns));


    }


    public static String randomElement(String[] sampleArray){
        int picker = MethodsExercises.random(sampleArray.length-1,0);
        return sampleArray[picker];
    }
}
