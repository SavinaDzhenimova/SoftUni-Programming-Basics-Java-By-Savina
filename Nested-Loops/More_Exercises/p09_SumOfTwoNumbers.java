package More_Exercises;

import java.util.Scanner;

public class p09_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int finalNum = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        boolean magic = false;
        int count = 0;

        for (int i = startNum; i <= finalNum; i++) {
            for (int j = startNum; j <= finalNum; j++) {
                int sum = i + j;
                count++;
                if (magicNum == sum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", count, i, j, magicNum);
                    magic = true;
                    break;
                }
            }
            if (magic) {
                break;
            }
        }
        if (!magic) {
            System.out.printf("%d combinations - neither equals %d%n", count, magicNum);
        }
    }
}
