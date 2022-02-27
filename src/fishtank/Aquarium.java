package fishtank;

import java.util.ArrayList;
import java.util.Iterator;

public class Aquarium {

    public final ArrayList<Fish> fishes = new ArrayList<>();
    
    public void feed() {

        fishes.forEach(fish -> {
            fish.feed();
        });
    }
    
    public void addFish(Fish fish) {
        fishes.add(fish);
    }
    
    public void removeFish() {
        
        Iterator<Fish> it = fishes.iterator();
        
        while(it.hasNext()) {
            Integer weight = it.next().getWeight();
            if(weight >= 11) {
                it.remove();
            }
        }
    }
    
    public void getStatus() {
        
        Iterator<Fish> it = fishes.iterator();
        
        while(it.hasNext()) {
            it.next().status();
        }
    }
}
