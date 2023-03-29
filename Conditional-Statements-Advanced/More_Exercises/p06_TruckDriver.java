package More_Exercises;

import java.util.Scanner;

public class p06_TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmPerMonth = Double.parseDouble(scanner.nextLine());
        double salary = 0.0;

        if (season.equals("Spring") || season.equals("Autumn")) {
            if (kmPerMonth <= 5000) {
                salary = kmPerMonth * 0.75 * 4;
            } else if (kmPerMonth > 5000 && kmPerMonth <= 10000) {
                salary = kmPerMonth * 0.95 * 4;
            } else if (kmPerMonth > 10000 && kmPerMonth <= 20000) {
                salary = kmPerMonth * 1.45 * 4;
            }
        } else if (season.equals("Summer")) {
            if (kmPerMonth <= 5000) {
                salary = kmPerMonth * 0.90 * 4;
            } else if (kmPerMonth > 5000 && kmPerMonth <= 10000) {
                salary = kmPerMonth * 1.10 * 4;
            } else if (kmPerMonth > 10000 && kmPerMonth <= 20000) {
                salary = kmPerMonth * 1.45 * 4;
            }
        } else if (season.equals("Winter")) {
            if (kmPerMonth <= 5000) {
                salary = kmPerMonth * 1.05 * 4;
            } else if (kmPerMonth > 5000 && kmPerMonth <= 10000) {
                salary = kmPerMonth * 1.25 * 4;
            } else if (kmPerMonth > 10000 && kmPerMonth <= 20000) {
                salary = kmPerMonth * 1.45 * 4;
            }
        }

        System.out.printf("%.2f", salary - salary * 0.10);
    }
}
