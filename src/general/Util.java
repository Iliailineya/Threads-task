package general;

import java.util.Arrays;

public class Util {
    public static void processSleep(long sleepTime) {
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " got interrupted");
        }
    }

    public static void show(String[] veges) {
        Arrays.stream(veges).forEach(System.out::println);
    }
}
