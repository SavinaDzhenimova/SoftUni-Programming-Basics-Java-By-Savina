package More_Exercises;

import java.util.Scanner;

public class p05_AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int count = 1;

        while (count <= n) {
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;
            count++;
        }

        double average = sum * 1.00 / n;
        System.out.printf("%.2f%n", average);
    }
}
