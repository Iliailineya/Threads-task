package task_02;

import general.*;

import java.util.Arrays;

// Виводяться фрукти, потім овочі
public class Main {

    public static void main(String[] arg) throws InterruptedException {

        Fruits fruits = new Fruits();
        fruits.start();
        fruits.join();
        Veges veges = new Veges();
        showVeges(veges.getFoodItems());
    }


    private static void showVeges(String[] veges) {
        Arrays.stream(veges).forEach(System.out::println);
    }
}
