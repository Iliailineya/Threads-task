package general;

public class Fruits extends FoodThread {
    public Fruits() {
        super("Fruits");
    }

    public Fruits(long sleepTime) {
        super("Fruits", sleepTime);
    }

    public Fruits(ThreadGroup group) {
        super(group, "Fruits");
    }

    @Override
    protected String[] getFoodItems() {
        return new String[]{"orange", "apple", "plum"};
    }
}
