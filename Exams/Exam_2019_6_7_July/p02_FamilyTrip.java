package Exam_2019_6_7_July;

import java.util.Scanner;

public class p02_FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int overnightCount = Integer.parseInt(scanner.nextLine());
        double overnightPrice = Double.parseDouble(scanner.nextLine());
        int extraExpensesPercentage = Integer.parseInt(scanner.nextLine());
        double totalOvernight = overnightCount * overnightPrice;
        double extraExpenses = budget * (extraExpensesPercentage / 100.0);

        if (overnightCount > 7) {
            overnightPrice = overnightPrice * 0.95;
            totalOvernight = overnightCount * overnightPrice;
        }

        double total = totalOvernight + extraExpenses;

        if (budget >= total) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - total);
        } else {
            System.out.printf("%.2f leva needed.", total - budget);
        }
    }
}
