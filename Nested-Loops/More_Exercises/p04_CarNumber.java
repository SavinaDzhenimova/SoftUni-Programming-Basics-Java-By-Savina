package More_Exercises;

import java.util.Scanner;

public class p04_CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int downNum = Integer.parseInt(scanner.nextLine());
        int upNum = Integer.parseInt(scanner.nextLine());

        for (int a = downNum; a <= upNum; a++) {
            for (int b = downNum; b <= upNum; b++) {
                for (int c = downNum; c <= upNum; c++) {
                    for (int d = downNum; d <= upNum; d++) {
                        if ((a % 2 == 0 && d % 2 != 0) || d % 2 == 0 && a % 2 != 0) {
                            if (a > d && (b + c) % 2 == 0) {
                                System.out.printf("%d%d%d%d ", a, b, c, d);
                            }
                        }
                    }
                }
            }
        }
    }
}
