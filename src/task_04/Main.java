package task_04;

import general.*;

public class Main {

    public static void main(String[] args) {
        demoRun();
    }

    public static void demoRun() {
        Fruits fruits = new Fruits(2000);
        fruits.start();
        fruits.interrupt();

        Veges veges = new Veges();
        Util.show(veges.getFoodItems());
    }
}
