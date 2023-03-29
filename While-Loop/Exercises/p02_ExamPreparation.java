package Exercises;

import java.util.Scanner;

public class p02_ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poorGrades = Integer.parseInt(scanner.nextLine());

        int count = 0;
        int poorGradesCount = 0;
        int sumGrades = 0;
        String previousProblemName = "";
        while (poorGradesCount < poorGrades) {
            String problemName = scanner.nextLine();
            if (problemName.equals("Enough")) {
                double averageScore = sumGrades * 1.00 / count;
                System.out.printf("Average score: %.2f%n", averageScore);
                System.out.printf("Number of problems: %d%n", count);
                System.out.printf("Last problem: %s%n", previousProblemName);
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());

            if (grade <= 4) {
                poorGradesCount++;
            }
            sumGrades += grade;
            count++;
            previousProblemName = problemName;
        }

        if (poorGrades == poorGradesCount) {
            System.out.printf("You need a break, %d poor grades.%n", poorGradesCount);
        }
    }
}
