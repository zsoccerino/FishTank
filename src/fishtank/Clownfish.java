package fishtank;

import java.util.Random;

public class Clownfish extends Fish implements Feed {
    
    public Clownfish() {}
    public Clownfish(String name) {
        this.name = name;
    }
    
    private static String[] colors = {"white", "black", "gray", "green", "blue", "red", "yellow", "pink", "magenta", "dark green", "dark blue"};
    
    private final Random myRandom = new Random();
    
    private final int randomValue = myRandom.nextInt(11);

    @Override
    public void feed() {
        this.weight += 1;
        this.color += (", " + colors[randomValue]);
    }
}
