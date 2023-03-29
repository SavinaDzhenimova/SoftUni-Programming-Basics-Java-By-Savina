package More_Exercises;

import java.util.Scanner;

public class p07_HousePainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double frontWall = x * x;
        double sideWall = x * y;
        double door = 1.2 * 2;
        double window = 1.5 * 1.5;
        double house = ((2 * frontWall) - door) + (2 * (sideWall - window));
        double roof = (2 * (x * y)) + (2 * (x * h) / 2);

        double housePainting = house / 3.4;
        double roofPainting = roof / 4.3;

        System.out.printf("%.2f %n", housePainting);
        System.out.printf("%.2f", roofPainting);
    }
}
