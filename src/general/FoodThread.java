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

    protected abstract String[] getFoodItems();

    public String getGroupName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":");
        processFoodItems();
        if (sleepTime>500)processSleep();
    }

    protected void processFoodItems() {
        for (String foodItem : getFoodItems()) {
            System.out.println(foodItem);
            if (sleepTime==500)processSleep();
        }
    }

    protected void processSleep() {
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " got interrupted");
        }
    }
}
