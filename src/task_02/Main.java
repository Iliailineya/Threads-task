package task_02;

import general.*;

import java.util.Arrays;

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
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println();

        Veges veges = new Veges();
        showVeges(veges.getFoodItems());
    }


    private static void showVeges(String[] veges) {
        Arrays.stream(veges).forEach(System.out::println);
    }
}
