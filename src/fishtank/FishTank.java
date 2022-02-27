package fishtank;

public class FishTank {
    
    public static void main(String[] args) {
        
        Aquarium myAquarium = new Aquarium();

        for (int i = 0; i < 5; i++) {
            myAquarium.addFish();
            myAquarium.feed();
            myAquarium.removeFish();
            myAquarium.getStatus();
            System.out.println("...");
        }
    }
}
