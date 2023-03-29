package Exam_2020_28_29_March;

import java.util.Scanner;

public class p06_TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalMoney = 0;
        int winDays = 0;

        for (int i = 1; i <= days; i++) {
            String sport = scanner.nextLine();
            double dayMoney = 0;
            int wins = 0;
            int lost = 0;

            while (!sport.equals("Finish")) {
                String result = scanner.nextLine();
                switch (result) {
                    case "win":
                        wins++;
                        dayMoney += 20;
                        break;
                    case "lose":
                        lost++;
                        break;
                }
                sport = scanner.nextLine();
            }
            if (wins > lost) {
                dayMoney += dayMoney * 0.10;
                winDays++;
            }
            totalMoney += dayMoney;
        }
        if (winDays > (days / 2)) {
            totalMoney += totalMoney * 0.20;
            System.out.printf("You won the tournament! Total raised money: %.2f%n", totalMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f%n", totalMoney);
        }
    }
}
