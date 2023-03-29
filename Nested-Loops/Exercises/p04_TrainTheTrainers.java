package Exercises;

import java.util.Scanner;

public class p04_TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String presentationName = scanner.nextLine();
        double sumAllGrades = 0;
        int count = 0;

        while (!presentationName.equals("Finish")) {
            String currentPresentation = presentationName;
            count++;
            double sumGrades = 0;

            for (int i = 1; i <= n; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                sumGrades += grade;
                sumAllGrades += grade;
            }
            double averageCurrentPresentation = sumGrades / n;

            System.out.printf("%s - %.2f.%n", currentPresentation, averageCurrentPresentation);
            presentationName = scanner.nextLine();
        }

        double average = sumAllGrades / (count * n);
        System.out.printf("Student's final assessment is %.2f.%n", average);
    }
}
