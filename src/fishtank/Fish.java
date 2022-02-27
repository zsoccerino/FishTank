package fishtank;

public abstract class Fish {
    
    protected final FishPropertyGenerator generator = new FishPropertyGenerator();

    protected String name = generator.getRandomName();
    protected int weight = generator.getRandomWeight();
    protected String color = generator.getRandomColor();
    
    public abstract void feed();
    
    protected String buildStatus() {
        return ("name: " + this.name + ", type: " + this.getClass().getSimpleName() + ", weight: " + this.weight + ", color: " + this.color);
    }
    
    public void status() {
        System.out.println(buildStatus());
    }
    
    public int getWeight() {
        return this.weight;
    }
}