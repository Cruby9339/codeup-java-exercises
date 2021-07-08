import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {
        String[] adjectives = {"beautiful", "slow", "smart", "feminine", "athletic", "sick", "cool", "loyal", "wise", "mature"};
        String[] nouns = {"dog", "cat", "otamatone", "ball", "pen", "screen", "paint", "water", "universe", "air"};
        System.out.println("Here is your server name: ");
        System.out.println(randomElement(adjectives) + "-" + randomElement(nouns));


    }


    public static String randomElement(String[] sampleArray){
        int picker = MethodsExercises.random(sampleArray.length-1,0);
        return sampleArray[picker];
    }
}
