package task_02;

import general.*;

// Виводяться фрукти, потім овочі
public class Main {

    public static void main(String[] arg) {
        demoRun();
    }

    public static void demoRun() {
        Fruits fruits = new Fruits();
        fruits.start();
        try {
            fruits.join();
        } catch (InterruptedException ie) {
            System.out.println("Exception: " + ie);
            ie.printStackTrace();
        }

        System.out.println();

        Veges veges = new Veges();
        Util.show(veges.getFoodItems());
    }
}
