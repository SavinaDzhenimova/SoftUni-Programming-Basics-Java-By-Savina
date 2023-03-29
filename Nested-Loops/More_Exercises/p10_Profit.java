package More_Exercises;

import java.util.Scanner;

public class p10_Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oneLevCoin = Integer.parseInt(scanner.nextLine());
        int twoLevCoin = Integer.parseInt(scanner.nextLine());
        int fiveLevBanknote = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());

        for (int one = 0; one <= oneLevCoin; one++) {
            for (int two = 0; two <= twoLevCoin; two++) {
                for (int five = 0; five <= fiveLevBanknote; five++) {
                    if (one + two * 2 + five * 5 == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", one, two, five,sum);
                    }
                }
            }
        }
    }
}
