package fishtank;

import java.util.Random;

public class FishPropertyGenerator {
    
    private final Random myRandom = new Random();
    private final String[] colors = {"white", "black", "gray", "green", "blue", "red", "yellow", "pink", "magenta", "dark green", "dark blue"};
    private final String[] names = {"Nemo", "Dory", "Jack", "James", "Johnny", "Kirk", "Greg", "Nora", "Joe", "Mary", "Josh"};
    
    public String getRandomName() {
        int randomValue = myRandom.nextInt(11);
        return this.names[randomValue];
    }
    
    public String getRandomColor() {
        int randomValue = myRandom.nextInt(11);
        return this.colors[randomValue];
    }
    
//    public int getRandomWeight() {
//        int randomValue = myRandom.nextInt(11);
//        return randomValue;
//    }
}
