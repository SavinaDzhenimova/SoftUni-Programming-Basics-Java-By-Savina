package Exercises;

import java.util.Scanner;

public class p05_Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String tabName = scanner.nextLine();

            if (tabName.equals("Facebook")) {
                salary -= 150;
            } else if (tabName.equals("Instagram")) {
                salary -= 100;
            } else if (tabName.equals("Reddit")) {
                salary -= 50;
            }

            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                return;
            }
        }
        System.out.println(salary);
    }
}