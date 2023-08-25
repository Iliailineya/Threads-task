package general;

public class Robot extends Thread {
    protected long sleepTime = 1500;

    public Robot(String str) {
        super(str);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Started");
        Util.processSleep(sleepTime);
        System.out.println(Thread.currentThread().getName() + " Waiting...");
        System.out.println(Thread.currentThread().getName() + " Stopped");
    }
}
