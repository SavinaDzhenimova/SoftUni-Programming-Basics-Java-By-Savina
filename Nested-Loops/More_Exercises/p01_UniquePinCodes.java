package More_Exercises;

import java.util.Scanner;

public class p01_UniquePinCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstDigit = Integer.parseInt(scanner.nextLine());
        int secondDigit = Integer.parseInt(scanner.nextLine());
        int thirdDigit = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= firstDigit; i += 2) {
            for (int j = 2; j <= secondDigit; j++) {
                for (int k = 2; k <= thirdDigit; k += 2) {
                    if (j == 2 || j == 3 || j == 5 || j == 7) {
                        System.out.printf("%d %d %d%n", i, j, k);
                    }
                }
            }
        }
    }
}
