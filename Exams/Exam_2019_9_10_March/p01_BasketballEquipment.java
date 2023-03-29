package Exam_2019_9_10_March;

import java.util.Scanner;

public class p01_BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearlyTax = Integer.parseInt(scanner.nextLine());

        double sneakers = yearlyTax * 0.60;
        double equipment = sneakers * 0.80;
        double ball = equipment * 0.25;
        double accessories = ball * 0.20;
        double total = yearlyTax + sneakers + equipment + ball + accessories;

        System.out.printf("%.2f", total);
    }
}
