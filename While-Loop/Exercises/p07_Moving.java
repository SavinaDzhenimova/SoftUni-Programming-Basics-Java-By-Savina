package Exercises;

import java.util.Scanner;

public class p07_Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int freeSpace = width * height * length;
        String cartonCount = scanner.nextLine();
        boolean isFull = false;

        while (!cartonCount.equals("Done")) {
            int input = Integer.parseInt(cartonCount);
            freeSpace -= input;

            if (freeSpace <= 0) {
                isFull = true;
                break;
            }

            cartonCount = scanner.nextLine();
        }

        if (isFull) {
            System.out.printf("No more free space! You need %d Cubic meters more.%n", Math.abs(freeSpace));
        } else {
            System.out.printf("%d Cubic meters left.%n", freeSpace);
        }
    }
}
