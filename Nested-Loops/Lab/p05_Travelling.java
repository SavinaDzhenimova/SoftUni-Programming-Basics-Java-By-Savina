package Lab;

import java.util.Scanner;

public class p05_Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")) {
            double tripPrice = Double.parseDouble(scanner.nextLine());

            while (tripPrice > 0) {
                double amount = Double.parseDouble(scanner.nextLine());
                tripPrice -= amount;
            }
            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
        }
    }
}
