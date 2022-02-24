package fishtank;

public abstract class Fish {
    protected String name;
    protected int weight = 1;
    protected String color = "white";
    protected Boolean memoryLoss = false;
    
    public void status() {
        System.out.println("name: " + this.name + ", weight: " + this.weight + ", color: " + this.color + ", short-term memory loss: " + this.memoryLoss);
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public int getWeight() {
        return this.weight;
    }
    
    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setColor(String newColor) {
        this.color = newColor;
    }
    
    public Boolean getMemoryLoss() {
        return this.memoryLoss;
    }
    
    public void setMemoryLoss(Boolean newMemState) {
        this.memoryLoss = newMemState;
    }
}
