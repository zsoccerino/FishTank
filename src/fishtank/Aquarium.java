package fishtank;

import java.util.ArrayList;

public class Aquarium implements Feed {

    public ArrayList<Fish> fishes = new ArrayList<>();  
    
    @Override
    public void feed() {
        
    }
    
    public void addFish(String type, String name) {
        
        if (type.equals("Clownfish")) {
            fishes.add(new Clownfish(name));
        }
        
        if (type.equals("Tang")) {
            fishes.add(new Tang(name));
        }
        
        if (type.equals("Kong")) {
            fishes.add(new Kong(name));
        }
        
    }
    
    public void removeFish() {
        
    }
    
    public void status() {
        
    }
    
}
