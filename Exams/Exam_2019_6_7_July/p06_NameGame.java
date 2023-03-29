package Exam_2019_6_7_July;

import java.util.Scanner;

public class p06_NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String winner = "";
        int maxScore = 0;

        while (!name.equals("Stop")) {
            int totalScore = 0;
            for (int i = 0; i < name.length(); i ++) {
                int number = Integer.parseInt(scanner.nextLine());
                int score = 0;

                if (number == name.codePointAt(i)) {
                    score += 10;
                } else {
                    score += 2;
                }
                totalScore += score;
            }
            if (totalScore >= maxScore) {
                maxScore = totalScore;
                winner = name;
            }
            name = scanner.nextLine();
        }
        System.out.printf("The winner is %s with %d points!%n", winner, maxScore);
    }
}
