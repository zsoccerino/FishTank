package fishtank;

import java.util.Random;

public class Tang extends Fish {
    
    private final Random memoryState = new Random();

    @Override
    public void status() {
        String status = "name: " + this.name + ", type: " + this.getClass().getSimpleName() + ", weight: " + this.weight + ", color: " + this.color + ", short-term memory loss: " + this.memoryLoss;
        System.out.println(status);
    }

    @Override
    public void feed() {
        this.weight += 1;
        this.memoryLoss = memoryState.nextBoolean();
    }
}
