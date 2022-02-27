package fishtank;

public abstract class Fish {
    
    protected final FishPropertyGenerator generator = new FishPropertyGenerator();

    protected String name = generator.getRandomName();
//    protected int weight = generator.getRandomWeight();
    protected int weight = 1;
    protected String color = generator.getRandomColor();
    protected Boolean memoryLoss = false;
    
    public abstract void feed();
    
    public void status() {
        String status = "name: " + this.name + ", type: " + this.getClass().getSimpleName() + ", weight: " + this.weight + ", color: " + this.color;
        System.out.println(status);
    }
    
    public int getWeight() {
        return this.weight;
    }
}