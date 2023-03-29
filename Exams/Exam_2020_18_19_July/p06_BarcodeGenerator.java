package Exam_2020_18_19_July;

import java.util.Scanner;

public class p06_BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int down = Integer.parseInt(scanner.nextLine());
        int up = Integer.parseInt(scanner.nextLine());
        int firstDigitDown = down / 1000;
        int secondDigitDown = (down % 1000) / 100;
        int thirdDigitDown = (down % 100) / 10;
        int fourthDigitDown = down % 10;

        int firstDigitUp = up / 1000;
        int secondDigitUp = (up % 1000) / 100;
        int thirdDigitUp = (up % 100) / 10;
        int fourthDigitUp = up % 10;

        for (int a = firstDigitDown; a <= firstDigitUp; a++) {
            for (int b = secondDigitDown; b <= secondDigitUp; b++) {
                for (int c = thirdDigitDown; c <= thirdDigitUp; c++) {
                    for (int d = fourthDigitDown; d <= fourthDigitUp; d++) {
                        if (a % 2 != 0 && b % 2 != 0 && c % 2 != 0 && d % 2 != 0) {
                            System.out.printf("%d%d%d%d ", a, b, c, d);
                        }
                    }
                }
            }
        }
    }
}
