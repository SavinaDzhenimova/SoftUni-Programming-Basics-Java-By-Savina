package Exam_2019_6_7_July;

import java.util.Scanner;

public class p04_Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        double totalPaint = (height * width * 4) * 1.00;
        int percent = Integer.parseInt(scanner.nextLine());
        totalPaint -= Math.ceil(totalPaint * (percent * 0.01));
        String command = scanner.nextLine();

        while (!command.equals("Tired!")) {
            int liters = Integer.parseInt(command);
            totalPaint -= liters;

            if (totalPaint <= 0) {
                break;
            }
            command = scanner.nextLine();
        }

        if (command.equals("Tired!")) {
            System.out.printf("%.0f quadratic m left.%n", totalPaint);
        }
        if (totalPaint < 0) {
            System.out.printf("All walls are painted and you have %.0f l paint left!%n", Math.abs(totalPaint));
        } else if (totalPaint == 0) {
            System.out.println("All walls are painted! Great job, Pesho!");
        }
    }
}
