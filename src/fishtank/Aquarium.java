package fishtank;

import java.util.ArrayList;
import java.util.Iterator;

public class Aquarium implements Feed {

    public ArrayList<Fish> fishes = new ArrayList<>();
    
    @Override
    public void feed() {
        
    }
    
    public void addFish(String type, String name) {
        
        if (type.equals("Clownfish")) {
            fishes.add(new Clownfish(name));
            //System.out.println(fishes);
        }
        
        if (type.equals("Tang")) {
            fishes.add(new Tang(name));
        }
        
        if (type.equals("Kong")) {
            fishes.add(new Kong(name));
            //System.out.println(fishes);

        }
        
    }
    
    public void removeFish() {
        
        Iterator<Fish> it = fishes.iterator();
        
        while(it.hasNext()) {
            Integer weight = it.next().getWeight();
            if(weight.equals(1)) {
                it.remove();
            }
            
        }
    }
    
    public void status() {
        
    }
    
}
