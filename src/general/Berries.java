package general;

public class Berries extends FoodThread {
    public Berries(ThreadGroup group) {
        super(group, "Berries");
    }

    @Override
    protected String[] getFoodItems() {
        return new String[]{"cherry", "strawberry", "raspberry"};
    }
}
