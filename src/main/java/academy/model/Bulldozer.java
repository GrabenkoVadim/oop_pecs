package academy.model;
public class Bulldozer extends Machine {
    private int horsePowers;
    public Bulldozer() {
        super();
    }
    public Bulldozer( String name, String color, int horsePowers){
        super(name, color);
        this.horsePowers = horsePowers;
    }

    public int getHorsePowers() {
        return horsePowers;
    }

    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
