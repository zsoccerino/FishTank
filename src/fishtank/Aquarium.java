package fishtank;

import java.util.ArrayList;
import java.util.Iterator;

public class Aquarium {

    public final ArrayList<Fish> fishes = new ArrayList<>();
    private final FishGenerator generator = new FishGenerator();
    
    public void addFish() {
        fishes.add(generator.getRandomFish());
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
    
        public void feed() {

        fishes.forEach(fish -> {
            fish.feed();
        });
    }
        
    public void getStatus() {
        
        Iterator<Fish> it = fishes.iterator();
        
        while(it.hasNext()) {
            it.next().status();
        }
    }
}
