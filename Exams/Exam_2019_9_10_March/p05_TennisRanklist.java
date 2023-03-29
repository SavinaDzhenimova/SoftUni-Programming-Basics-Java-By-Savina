package Exam_2019_9_10_March;

import java.util.Scanner;

public class p05_TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int startingScore = Integer.parseInt(scanner.nextLine());
        int wins = 0;
        int finalScore = 0;

        for (int i = 1; i <= n; i++) {
            String tournamentStage = scanner.nextLine();

            switch (tournamentStage) {
                case "W":
                    finalScore += 2000;
                    wins++;
                    break;
                case "F":
                    finalScore += 1200;
                    break;
                case "SF":
                    finalScore += 720;
                    break;
            }
        }

        int averageScore = finalScore / n;
        double percentWins = (wins * 1.00 / n) * 100;
        System.out.printf("Final points: %d%n", startingScore + finalScore);
        System.out.printf("Average points: %d%n", averageScore);
        System.out.printf("%.2f%%", percentWins);
    }
}
