package More_Exercises;

import java.util.Scanner;

public class p07_SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int max = Integer.parseInt(scanner.nextLine());
        int count = 0;

        for (int i = 35; i <= 55; i++) {
            for (int j = 64; j <= 96; j++) {
                for (int x =1; x <= a; x++) {
                    for (int y = 1; y <= b; y++) {
                        System.out.printf("%c%c%d%d%c%c|", i, j, x, y, j, i);
                        count++;
                        i++;
                        j++;
                        if (count >= max || (x == a && y == b)) {
                            return;
                        }
                        if (i > 55) {
                            i = 35;
                        }
                        if (j > 96) {
                            j = 64;
                        }
                    }
                }
            }
        }
    }
}
