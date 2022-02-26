package fishtank;

public class FishTank {
    
    public static void main(String[] args) {
        
        Aquarium myAquarium = new Aquarium();
        
        myAquarium.addFish("Clownfish", "Nemo");
        myAquarium.addFish("Kong", "Dory");
        myAquarium.addFish("Tang", "Béla");
        System.out.println(myAquarium.fishes);
        myAquarium.status();
    }
}
