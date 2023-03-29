package More_Exercises;

import java.util.Scanner;

public class p06_Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double water = 20;
        double internet = 15;
        double others = 0;

        double waterBill = 0;
        double internetBill = 0;
        double electricityBill = 0;
        double otherBills = 0;

        for (int i = 1; i <= n; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());

            waterBill += water;
            internetBill += internet;
            electricityBill += electricity;
            others = (electricity + water + internet) * 1.20;
            otherBills += others;
        }

        double average = (electricityBill + waterBill + internetBill + otherBills) / n;

        System.out.printf("Electricity: %.2f lv%n", electricityBill);
        System.out.printf("Water: %.2f lv%n", waterBill);
        System.out.printf("Internet: %.2f lv%n", internetBill);
        System.out.printf("Other: %.2f lv%n", otherBills);
        System.out.printf("Average: %.2f lv%n", average);
    }
}
