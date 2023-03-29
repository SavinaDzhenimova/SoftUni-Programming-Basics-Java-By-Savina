package Exam_2019_6_7_July;

import java.util.Scanner;

public class p05_FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String teamName = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        int wins = 0;
        int draw = 0;
        int lose = 0;
        int score = 0;

        if (n == 0) {
            System.out.printf("%s hasn't played any games during this season.", teamName);
        } else {
            for (int i = 1; i <= n; i++) {
                String result = scanner.nextLine();

                switch (result) {
                    case "W":
                        score += 3;
                        wins++;
                        break;
                    case "D":
                        score += 1;
                        draw++;
                        break;
                    case "L":
                        lose++;
                        break;
                }
            }

            double percentWins = (wins * 1.00 / n) * 100;
            System.out.printf("%s has won %d points during this season.%n", teamName, score);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n", wins);
            System.out.printf("## D: %d%n", draw);
            System.out.printf("## L: %d%n", lose);
            System.out.printf("Win rate: %.2f%%", percentWins);
        }
    }
}
