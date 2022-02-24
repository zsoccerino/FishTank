package fishtank;

public class Clownfish extends Fish implements Feed {
    
    public Clownfish() {}
    
    public Clownfish(String name) {
        this.name = name;
    }
    
    public String[] colors = {"white", "black", "gray", "green", "blue", "red", "yellow", "pink", "magenta", "dark green", "dark blue", };

    @Override
    public void feed() {
        this.weight += 1;
    }

}
