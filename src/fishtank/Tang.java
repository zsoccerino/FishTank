package fishtank;

import java.util.Random;

public class Tang extends Fish {
    
    private Boolean memoryLoss;
    private final Random memoryState = new Random();

    @Override
    public void status() {
        System.out.println(buildStatus() + ", short-term memory loss: " + this.memoryLoss);
    }

    @Override
    public void feed() {
        this.weight += 1;
        this.memoryLoss = memoryState.nextBoolean();
    }
}