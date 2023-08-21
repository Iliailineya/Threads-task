package task_03;

import general.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group = new ThreadGroup("Thread group");
        showGroupFruits(group);
        showGroupVeges(group);
        showGroupBerries(group);
    }

    private static void showGroupFruits(ThreadGroup group) throws InterruptedException {
        Fruits fruits = new Fruits(group, "\nFruits:");
        fruits.start();
        fruits.join();
    }

    private static void showGroupVeges(ThreadGroup group) throws InterruptedException {
        Veges veges = new Veges(group, "\nVeges:");
        veges.start();
        veges.join();
    }

    private static void showGroupBerries(ThreadGroup group) throws InterruptedException {
        Berries berries = new Berries(group, "\nBerries:");
        berries.start();
        berries.join();
    }
}
