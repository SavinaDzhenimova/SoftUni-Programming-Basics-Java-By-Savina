package More_Exercises;

import java.util.Scanner;

public class p01_Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottlesDetergent = Integer.parseInt(scanner.nextLine());
        int detergentQuantity = bottlesDetergent * 750;
        String command = scanner.nextLine();
        int dishesCount = 0;
        int potsCount = 0;
        int count = 0;

        while (!command.equals("End")) {
            count++;

            if (count % 3 == 0) {
                int pots = Integer.parseInt(command);
                potsCount += pots;
                detergentQuantity -= pots * 15;
            } else {
                int dishes = Integer.parseInt(command);
                dishesCount += dishes;
                detergentQuantity -= dishes * 5;
            }

            if (detergentQuantity < 0) {
                break;
            }

            command = scanner.nextLine();
        }

        if (detergentQuantity >= 0) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", dishesCount, potsCount);
            System.out.printf("Leftover detergent %d ml.%n", detergentQuantity);
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!%n", Math.abs(detergentQuantity));
        }
    }
}
