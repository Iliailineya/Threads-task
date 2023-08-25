package task_01;

import general.Robot;

public class Main {
    public static void main(String[] args) {
        startRobot("Robot 1.0");
        startRobot("Robot 2.0");
    }

    private static void startRobot(String name) {
        Robot robot = new Robot(name);
        getRobotInfo(robot);
        robot.start();
        getRobotInfo(robot);
    }

    private static void getRobotInfo(Robot robot) {
        System.out.println(robot.getName() + " state: " + robot.getState());
    }
}
