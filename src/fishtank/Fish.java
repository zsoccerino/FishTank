package fishtank;

public abstract class Fish {
    protected String name;
    protected byte weight = 1;
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
    
    public byte getWeight() {
        return this.weight;
    }
    
    public void setWeight(byte newWeight) {
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
