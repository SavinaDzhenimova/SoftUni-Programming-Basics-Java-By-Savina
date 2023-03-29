package More_Exercises;

import java.util.Scanner;

public class p01_PipesInPool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int capacity = Integer.parseInt(scan.nextLine());
        int p1 = Integer.parseInt(scan.nextLine());
        int p2 = Integer.parseInt(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        char percentage = '%';
        double p1Debit = h * p1;
        double p2Debit = h * p2;
        double fullness = p1Debit + p2Debit;
        double fullnessInPercentage = (fullness / capacity) * 100;
        double p1Percentage = (p1Debit / fullness) * 100;
        double p2Percentage = (p2Debit / fullness) * 100;

        if (fullness <= capacity) {
            System.out.printf("The pool is %.0f%c full. Pipe 1: %.0f%c. Pipe 2: %.0f%c.",
                    Math.floor(fullnessInPercentage), percentage, Math.floor(p1Percentage),
                    percentage,  Math.floor(p2Percentage), percentage);
        } else {
            double extraLitres = fullness - capacity;
            System.out.printf("For %f hours the pool overflows with %f liters.",
                    h, extraLitres);
        }
    }
}
