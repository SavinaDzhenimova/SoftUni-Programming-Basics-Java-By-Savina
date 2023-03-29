package Exam_2020_28_29_March;

import java.util.Scanner;

public class p05_SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        int count = 0;

        while (!command.equals("End")) {
            double suitcaseCapacity = Double.parseDouble(command);
            count++;

            if (count % 3 == 0) {
                suitcaseCapacity *= 1.10;
            }
            capacity -= suitcaseCapacity;

            if (capacity < 0) {
                System.out.println("No more space!");
                count--;
                break;
            }
            command = scanner.nextLine();
            if (command.equals("End")) {
                System.out.println("Congratulations! All suitcases are loaded!");
                break;
            }
        }
        System.out.printf("Statistic: %d suitcases loaded.%n", count);
    }
}
