package Exam_2019_9_10_March;

import java.util.Scanner;

public class p06_BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tournamentName = scanner.nextLine();
        int teamDesiWins = 0;
        int teamDesiLost = 0;
        int matches = 0;

        while (!tournamentName.equals("End of tournaments")) {
            int matchesCount = Integer.parseInt(scanner.nextLine());

            for (int i = 1; i <= matchesCount; i++) {
                int teamDesiScore = Integer.parseInt(scanner.nextLine());
                int teamOppositeScore = Integer.parseInt(scanner.nextLine());

                if (teamDesiScore > teamOppositeScore) {
                    System.out.printf("Game %d of tournament %s: win with %d points.%n",
                            i, tournamentName, teamDesiScore - teamOppositeScore);
                    teamDesiWins++;
                } else {
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n",
                            i, tournamentName, teamOppositeScore - teamDesiScore);
                    teamDesiLost++;
                }
            }
            matches += matchesCount;
            tournamentName = scanner.nextLine();
        }
        System.out.printf("%.2f%% matches win%n", (teamDesiWins * 1.00 / matches) * 100);
        System.out.printf("%.2f%% matches lost%n", (teamDesiLost * 1.00 / matches) * 100);
    }
}
