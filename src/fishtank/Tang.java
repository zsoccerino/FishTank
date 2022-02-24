package fishtank;

public class Tang extends Fish implements Feed {
    
    public Tang() {}
    
    public Tang(String name) {
        this.name = name;
    }

    @Override
    public void feed() {
    }
}
