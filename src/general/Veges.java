package general;

public class Veges extends FoodThread {
    public Veges() {
    }

    public Veges(long sleepTime) {
        super(sleepTime);
    }

    public Veges(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public String[] getFoodItems() {
        return new String[]{"tomato", "cucumber", "carrot"};
    }
}
