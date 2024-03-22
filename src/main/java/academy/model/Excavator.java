package academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int HeightOfLifting;
    public Excavator() {
    }

    public Excavator (String name, String color, int HeightOfLifting) {
        super(name, color);
        this.HeightOfLifting = HeightOfLifting;
    }

    public int getHeightOfLifting() {
        return HeightOfLifting;
    }

    public void setHeightOfLifting(int heightOfLifting) {
        HeightOfLifting = heightOfLifting;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
