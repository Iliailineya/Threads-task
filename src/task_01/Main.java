package task_01;

import general.Robot;

public class Main {

    private static final String ROBOT_1 = "Robot 1.0";
    private static final String ROBOT_2 = "Robot 2.0";

    public static void main(String[] args) {
        startRobot(ROBOT_1);
        startRobot(ROBOT_2);
    }

    private static void startRobot(String name) {
        Robot robot = createRobot(name);
        printRobotInfo(robot);
        robot.start();
        printRobotInfo(robot);
    }

    private static Robot createRobot(String name) {
        return new Robot(name);
    }

    private static void printRobotInfo(Robot robot) {
        System.out.println(robot.getName() + " state: " + robot.getState());
    }
}
