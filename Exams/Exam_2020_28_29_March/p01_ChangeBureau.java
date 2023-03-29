package Exam_2020_28_29_March;

import java.util.Scanner;

public class p01_ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoins = Integer.parseInt(scanner.nextLine());
        double chineseYuan = Double.parseDouble(scanner.nextLine());
        double commissionPercentage = Double.parseDouble(scanner.nextLine());

        int bitcoinsToBgn = bitcoins * 1168;
        double chineseYuanToUsd = chineseYuan * 0.15;
        double usdToBgn = chineseYuanToUsd * 1.76;
        double totalSum = usdToBgn + bitcoinsToBgn;
        double bgnToEuro = totalSum / 1.95;
        double commission = (commissionPercentage / 100) * bgnToEuro;
        double total = bgnToEuro - commission;

        System.out.printf("%.2f", total);
    }
}
