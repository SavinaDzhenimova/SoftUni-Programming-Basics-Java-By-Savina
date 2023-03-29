package More_Exercises;

import java.util.Scanner;

public class p05_ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menCount = Integer.parseInt(scanner.nextLine());
        int womenCount = Integer.parseInt(scanner.nextLine());
        int tablesCount = Integer.parseInt(scanner.nextLine());
        int count = 0;

        for (int m = 1; m <= menCount; m++) {
            for (int w = 1; w <= womenCount; w++) {
                if (count < tablesCount) {
                    System.out.printf("(%d <-> %d) ", m, w);
                    count++;
                } else {
                    break;
                }
            }
        }
    }
}
