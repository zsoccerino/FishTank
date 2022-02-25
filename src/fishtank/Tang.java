package fishtank;

import java.util.Random;

public class Tang extends Fish implements Feed {
    
    public Tang() {}
    public Tang(String name) {
        this.name = name;
    }
    
    private final Random myRandom = new Random();
    private final int randomValue = myRandom.nextInt(2);

    @Override
    public void feed() {
        this.weight += 1;
        this.memoryLoss = (randomValue == 1);
    }
}
