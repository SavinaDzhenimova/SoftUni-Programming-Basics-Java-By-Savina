package More_Exercises;

import java.util.Scanner;

public class p14_PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                for (int c = 'a'; c < 'a' + l; c++) {
                    for (int d = 'a'; d < 'a' + l; d++) {
                        for (int e = 2; e <= n; e++) {
                            if (e > a && e > b) {
                                System.out.printf("%d%d%c%c%d ", a, b, c, d, e);
                            }
                        }
                    }
                }
            }
        }
    }
}
