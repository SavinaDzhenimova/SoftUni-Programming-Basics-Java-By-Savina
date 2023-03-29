package More_Exercises;

import java.util.Scanner;

public class p02_LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char startLetter = scanner.nextLine().charAt(0);
        char finalLetter = scanner.nextLine().charAt(0);
        char missLetter = scanner.nextLine().charAt(0);
        int count = 0;

        for (char i = startLetter; i <= finalLetter; i++) {
            for (int j = startLetter; j <= finalLetter; j++) {
                for (int k = startLetter; k <= finalLetter; k++) {
                    if (i != missLetter && j != missLetter && k != missLetter) {
                        count++;
                        System.out.printf("%c%c%c ", i, j, k);
                    }
                }
            }
        }
        System.out.printf("%d", count);
    }
}
