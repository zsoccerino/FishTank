package fishtank;

import java.util.ArrayList;

public abstract class Fish {
    private String name;
    private byte weight;
    private ArrayList<String> color = new ArrayList<String>();
    
    public void status() {
        System.out.println("status info here");
    }
    
    public void feed() {
        System.out.println("feed info here");
    }
    
    public String getName () {
        return this.name;
    }
    
    public void setName (String newName) {
        this.name = newName;
    }
    
    public byte getWeight () {
        return this.weight;
    }
    
    public void setWeight (byte newWeight) {
        this.weight = newWeight;
    }
    
    public ArrayList<String> getColor () {
        return this.color;
    }
    
    public void setColor (ArrayList<String> newColor) {
        this.color = newColor;
    }
}
