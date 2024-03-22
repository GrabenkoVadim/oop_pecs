package academy.model;


public class Truck extends Machine {
    private int pace;

    public Truck() {
    }

    public Truck(String name, String color, int pace) {
        super(name, color);
        this.pace = pace;
    }

    public int getPace() {
        return pace;
    }

    public void setPace(int pace) {
        this.pace = pace;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
