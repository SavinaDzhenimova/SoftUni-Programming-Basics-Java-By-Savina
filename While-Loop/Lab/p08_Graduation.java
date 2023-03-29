package Lab;

import java.util.Scanner;

public class p08_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        double sumGrades = 0;
        int poorGradeCount = 0;
        int year = 1;
        while (year <= 12) {
            if (poorGradeCount > 1) {
                break;
            }

            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4) {
                poorGradeCount++;
                continue;
            }

            sumGrades += grade;
            year++;
        }

        if (poorGradeCount > 1) {
            System.out.printf("%s has been excluded at %d grade%n", name, year);
        } else {
            double averageGrades = sumGrades / 12;
            System.out.printf("%s graduated. Average grade: %.2f%n", name, averageGrades);
        }
    }
}
