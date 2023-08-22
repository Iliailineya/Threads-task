package task_04;

import general.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        demoRun();
    }

    public static void demoRun() {
        Fruits fruits = new Fruits(2000);
        fruits.start();
        fruits.interrupt();

        Veges veges = new Veges();
        showVeges(veges.getFoodItems());
    }

    private static void showVeges(String[] veges) {
        Arrays.stream(veges).forEach(System.out::println);
    }
}
