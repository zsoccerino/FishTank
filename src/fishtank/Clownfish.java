package fishtank;

public class Clownfish extends Fish {
    
    @Override
    public void feed() {
        System.out.println("fishtank.Clownfish.feed()");
        this.weight += 1;
        this.color += (", " + this.generator.getRandomColor());
    }
}
