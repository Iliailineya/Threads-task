package task_03;

import general.*;

public class Main {

    public static void main(String[] args) {
        demoRun();
    }

    public static void demoRun() {
        ThreadGroup group = new ThreadGroup("Thread group");

        showGroupFood(new Fruits(group));
        System.out.println();
        showGroupFood(new Veges(group));
        System.out.println();
        showGroupFood(new Berries(group));

    }

    private static <T extends FoodThread> void showGroupFood(T food) {
        Thread thread = new Thread(food.getThreadGroup(), food, food.getGroupName());
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
