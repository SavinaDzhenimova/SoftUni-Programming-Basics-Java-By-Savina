package Lab;

import java.util.Scanner;

public class p04_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        boolean isFound = false;
        int count = 0;
        for (int i = firstNum; i <= secondNum; i++) {
            for (int j = firstNum; j <= secondNum; j++) {
                int sum = i + j;
                count++;
                if (sum == magicNum) {
                    isFound = true;
                    System.out.printf("Combination N:%d ", count);
                    System.out.printf("(%d + %d = %d)%n", i, j, magicNum);
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d%n", count, magicNum);
        }
    }
}
