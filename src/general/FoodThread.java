package general;

public abstract class FoodThread extends Thread {
    protected long sleepTime = 500;

    public FoodThread() {
    }

    public FoodThread(long sleepTime) {
        this.sleepTime = sleepTime;
    }

    public FoodThread(ThreadGroup group, String name) {
        super(group, name);
    }

    protected abstract String[] getFoodItems();

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (String foodItem : getFoodItems()) {
            System.out.println(foodItem);
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException ie) {
                System.out.println(Thread.currentThread().getName());
            }
        }
    }
}
