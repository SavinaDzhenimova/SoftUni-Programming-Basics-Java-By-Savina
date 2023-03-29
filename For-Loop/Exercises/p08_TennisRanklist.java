package Exercises;

import java.util.Scanner;

public class p08_TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        double earnedPoints = 0;
        double wins = 0;
        for (int i = 1; i <= n; i++) {
            String tournamentStage = scanner.nextLine();

            switch (tournamentStage) {
                case "W":
                    earnedPoints += 2000;
                    wins++;
                    break;
                case "F":
                    earnedPoints += 1200;
                    break;
                case "SF":
                    earnedPoints += 720;
                    break;
            }
        }

        double finalPoints = startingPoints + earnedPoints;
        double averagePoints = Math.floor(earnedPoints / n);
        double percentWins = (wins / n) * 100;

        System.out.printf("Final points: %.0f%n", finalPoints);
        System.out.printf("Average points: %.0f%n", averagePoints);
        System.out.printf("%.2f%%%n", percentWins);
    }
}
