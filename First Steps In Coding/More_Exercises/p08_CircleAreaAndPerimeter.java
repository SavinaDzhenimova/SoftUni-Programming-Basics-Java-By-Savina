package More_Exercises;

import java.util.Scanner;

public class p08_CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double r = Double.parseDouble(scan.nextLine());

        double area = Math.PI * r * r;
        double parameter = 2 * Math.PI * r;

        System.out.printf("%.2f %n", area);
        System.out.printf("%.2f", parameter);
    }
}
