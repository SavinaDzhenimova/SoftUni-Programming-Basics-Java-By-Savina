package Exam_2019_2_3_May;

import java.util.Scanner;

public class p03_MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String termOfContract = scanner.nextLine();
        String typeOfContract = scanner.nextLine();
        String mobileInternet = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());
        double tax = 0.0;

        if (termOfContract.equals("one")) {
            if (typeOfContract.equals("Small")) {
                tax = 9.98;
            } else if (typeOfContract.equals("Middle")) {
                tax = 18.99;
            } else if (typeOfContract.equals("Large")) {
                tax = 25.98;
            } else if (typeOfContract.equals("ExtraLarge")) {
                tax = 35.99;
            }
        } else if (termOfContract.equals("two")) {
            if (typeOfContract.equals("Small")) {
                tax = 8.58;
            } else if (typeOfContract.equals("Middle")) {
                tax = 17.09;
            } else if (typeOfContract.equals("Large")) {
                tax = 23.59;
            } else if (typeOfContract.equals("ExtraLarge")) {
                tax = 31.79;
            }
        }

        if (mobileInternet.equals("yes")) {
            if (tax <= 10) {
                tax = tax + 5.50;
            } else if (tax <= 30) {
                tax = tax + 4.35;
            } else if (tax > 30) {
                tax = tax + 3.85;
            }
        }

        double total = tax * months;

        if (termOfContract.equals("two")) {
            total = total - total * 0.0375;
        }

        System.out.printf("%.2f lv.", total);
    }
}
