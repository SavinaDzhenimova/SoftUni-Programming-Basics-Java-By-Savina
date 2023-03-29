package Exam_2019_6_7_April;

import java.util.Scanner;

public class p01_OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());

        double statuePrice = rent * 0.70;
        double catering = statuePrice * 0.85;
        double sounding = 0.5 * catering;

        double total = rent + statuePrice + catering + sounding;
        System.out.printf("%.2f", total);
    }
}
