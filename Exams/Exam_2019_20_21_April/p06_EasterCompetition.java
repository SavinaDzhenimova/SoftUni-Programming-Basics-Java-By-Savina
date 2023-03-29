package Exam_2019_20_21_April;

import java.util.Scanner;

public class p06_EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBreadCount = Integer.parseInt(scanner.nextLine());
        String bakerName = scanner.nextLine();
        String winner = "";
        int maxGrade = 0;

        for (int i = 1; i <= easterBreadCount; i++) {
            String input = scanner.nextLine();
            int bakerGrade = 0;
            while (!input.equals("Stop")) {
                int grade = Integer.parseInt(input);
                bakerGrade += grade;
                input = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", bakerName, bakerGrade);
            if (bakerGrade > maxGrade) {
                maxGrade = bakerGrade;
                winner = bakerName;
                System.out.printf("%s is the new number 1!%n", bakerName);
            }
            if (i == easterBreadCount) {
                break;
            }
            bakerName = scanner.nextLine();
        }
        System.out.printf("%s won competition with %d points!%n", winner, maxGrade);
    }
}
