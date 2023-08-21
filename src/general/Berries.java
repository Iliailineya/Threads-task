package general;

public class Berries extends FoodThread {
    public Berries() {
    }

    public Berries(long sleepTime) {
        super(sleepTime);
    }

    public Berries(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    protected String[] getFoodItems() {
        return new String[]{"cherry", "strawberry", "raspberry"};
    }
}
