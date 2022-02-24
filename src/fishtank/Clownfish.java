package fishtank;

import java.util.Random;

public class Clownfish extends Fish implements Feed {
    
    public Clownfish() {}
    
    public Clownfish(String name) {
        this.name = name;
    }
    
    public String[] colors = {"white", "black", "gray", "green", "blue", "red", "yellow", "pink", "magenta", "dark green", "dark blue", };
    
    Random myRandom = new Random();
    
    int rn = myRandom.nextInt(11);

    @Override
    public void feed() {
        this.weight += 1;
        this.color += (", " + colors[rn]);
        System.out.println(rn);
    }

}
