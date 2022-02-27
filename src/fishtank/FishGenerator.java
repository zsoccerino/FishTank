package fishtank;

import java.util.Random;

public class FishGenerator {
    
    private final Random myRandom = new Random();
    
    public Fish getRandomFish() {
        Fish[] fishes = {new Clownfish(), new Tang(), new Kong()};
        int randomValue = myRandom.nextInt(2);
        return fishes[randomValue];
    }
}