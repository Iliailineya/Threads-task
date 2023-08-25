package general;

public abstract class FoodThread extends Thread {
    protected long sleepTime = 500;

    public FoodThread(String name) {
        super(name);
    }

    public FoodThread(ThreadGroup group, String name) {
        super(group, name);
    }

    public FoodThread(String name, long sleepTime) {
        super(name);
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":");
        for (String foodItem : getFoodItems()) {
            System.out.println(foodItem);
            if (sleepTime == 500) Util.processSleep(sleepTime);
        }

        if (sleepTime > 500) Util.processSleep(sleepTime);
    }

    protected abstract String[] getFoodItems();
}
