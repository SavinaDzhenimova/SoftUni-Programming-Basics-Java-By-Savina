package Exam_2019_9_10_March;

import java.util.Scanner;

public class p04_GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstPlayerName = scanner.nextLine();
        String secondPlayerName = scanner.nextLine();
        String command = scanner.nextLine();
        int scoreFirstPlayer = 0;
        int scoreSecondPlayer = 0;
        boolean firstWin = false;
        boolean numberWars = false;

        while (!command.equals("End of game")) {
            int firstCard = Integer.parseInt(command);
            command = scanner.nextLine();
            int secondCard = Integer.parseInt(command);

            if (firstCard > secondCard) {
                int score = firstCard - secondCard;
                scoreFirstPlayer += score;
            } else if (firstCard < secondCard) {
                int score = secondCard - firstCard;
                scoreSecondPlayer += score;
            } else {
                numberWars = true;
                firstCard = Integer.parseInt(scanner.nextLine());
                secondCard = Integer.parseInt(scanner.nextLine());
                if (firstCard > secondCard) {
                    firstWin = true;
                }
                break;
            }

            if (scoreFirstPlayer > scoreSecondPlayer) {
                firstWin = true;
            }

            command = scanner.nextLine();
        }

        if (numberWars) {
            System.out.println("Number wars!");
            if (firstWin) {
                System.out.printf("%s is winner with %d points", firstPlayerName, scoreFirstPlayer);
            } else {
                System.out.printf("%s is winner with %d points", secondPlayerName, scoreSecondPlayer);
            }
        }
        if (command.equals("End of game")) {
            System.out.printf("%s has %d points%n", firstPlayerName, scoreFirstPlayer);
            System.out.printf("%s has %d points%n", secondPlayerName, scoreSecondPlayer);
        }
    }
}
