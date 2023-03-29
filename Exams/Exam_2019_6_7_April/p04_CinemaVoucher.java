package Exam_2019_6_7_April;

import java.util.Scanner;

public class p04_CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double voucher = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        double price;
        int movieCount = 0;
        int othersCount = 0;

        while (!command.equals("End")) {

            if (command.length() > 8) {
                price = command.charAt(0) + command.charAt(1);
                voucher -= price;
                if (voucher < 0) {
                    break;
                }
                movieCount++;
            } else {
                price = command.charAt(0);
                voucher -= price;
                if (voucher < 0) {
                    break;
                }
                othersCount++;
            }

            command = scanner.nextLine();
        }

        System.out.println(movieCount);
        System.out.println(othersCount);
    }
}
