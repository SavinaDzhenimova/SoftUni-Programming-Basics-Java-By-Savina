package More_Exercises;

import java.util.Scanner;

public class p13_PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startFirst = Integer.parseInt(scanner.nextLine());
        int startSecond = Integer.parseInt(scanner.nextLine());
        int differenceFirst = Integer.parseInt(scanner.nextLine());
        int differenceSecond = Integer.parseInt(scanner.nextLine());
        int upFirst = startFirst + differenceFirst;
        int upSecond = startSecond + differenceSecond;

        for (int a = startFirst; a <= upFirst; a++) {
            for (int b = startSecond; b <= upSecond; b++) {
                if (a % 2 != 0 && a % 3 != 0 && a % 5 != 0 && a % 7 != 0) {
                    if (b % 2 != 0 && b % 3 != 0 && b % 5 != 0 && b % 7 != 0) {
                        System.out.printf("%d%d%n", a, b);
                    }
                }
            }
        }
    }
}
