package fishtank;

public class Clownfish extends Fish {
    
    @Override
    public void feed() {
        this.weight += 1;
        this.color += (", " + this.generator.getRandomColor());
    }
}