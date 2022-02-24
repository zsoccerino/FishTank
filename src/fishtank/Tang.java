package fishtank;

public class Tang extends Fish implements Feed {
    
    public Tang() {}
    
    public Tang(String name) {
        this.name = name;
    }

    @Override
    public void feed() {
        this.weight += 1;
        this.memoryLoss = true;
    }
}
