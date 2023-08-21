package general;


public class Robot extends Thread {

    public Robot(String str) {
        super(str);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Started");
        try {
            Robot.sleep(1500);
            System.out.println(Thread.currentThread().getName() + " Waiting...");
        } catch (InterruptedException ie) {
            System.out.println("Exception: " + ie);
            ie.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " Stopped");
    }
}
