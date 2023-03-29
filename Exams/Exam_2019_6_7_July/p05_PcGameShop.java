package Exam_2019_6_7_July;

import java.util.Scanner;

public class p05_PcGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int hearthstone = 0;
        int fornite = 0;
        int overWatch = 0;
        int others = 0;

        for (int i = 1; i <= n; i++) {
            String gameName = scanner.nextLine();

            if (gameName.equals("Hearthstone")) {
                hearthstone++;
            } else if (gameName.equals("Fornite")) {
                fornite++;
            } else if (gameName.equals("Overwatch")) {
                overWatch++;
            } else {
                others++;
            }
        }

        double percentHearthstone = (hearthstone * 1.00 / n) * 100;
        double percentFornite = (fornite * 1.00 / n) * 100;
        double percentOverWatch = (overWatch * 1.00 / n) * 100;
        double percentOthers = (others * 1.00 / n) * 100;

        System.out.printf("Hearthstone - %.2f%%%n", percentHearthstone);
        System.out.printf("Fornite - %.2f%%%n", percentFornite);
        System.out.printf("Overwatch - %.2f%%%n", percentOverWatch);
        System.out.printf("Others - %.2f%%%n", percentOthers);
    }
}
