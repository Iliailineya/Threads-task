package general;

public class Veges extends FoodThread {
    public Veges() {
        super("Veges");
    }

    public Veges(ThreadGroup group) {
        super(group, "Veges");
    }

    @Override
    public String[] getFoodItems() {
        return new String[]{"tomato", "cucumber", "carrot"};
    }
}
