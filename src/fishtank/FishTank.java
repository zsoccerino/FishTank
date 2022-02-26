package fishtank;

public class FishTank {
    
    public static void main(String[] args) {
        
        Aquarium myAquarium = new Aquarium();
        
        myAquarium.addFish("Clownfish", "Nemo");
        myAquarium.addFish("Kong", "Dory");
        System.out.println(myAquarium.fishes);
        myAquarium.removeFish();
        System.out.println(myAquarium.fishes);
    }
}
