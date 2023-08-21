package general;

public class Fruits extends FoodThread {
    public Fruits() {
    }

    public Fruits(long sleepTime) {
        super(sleepTime);
    }

    public Fruits(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    protected String[] getFoodItems() {
        return new String[]{"orange", "apple", "plum"};
    }
}
