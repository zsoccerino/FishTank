package fishtank;

public class FishTank {
    
    public static void main(String[] args) {
        
        FishGenerator generator = new FishGenerator();
        Aquarium myAquarium = new Aquarium();
        
//        Clownfish clownFish = new Clownfish();
//        Kong kong = new Kong();
//        Tang tang = new Tang();
//        
//        
//        myAquarium.addFish(clownFish);
//        myAquarium.addFish(kong);
//        myAquarium.addFish(tang);

        myAquarium.addFish(generator.getRandomFish());
        myAquarium.addFish(generator.getRandomFish());

        myAquarium.getStatus();
        myAquarium.feed();
        myAquarium.getStatus();
    }
}
