package Exam_2019_9_10_March;

import java.util.Scanner;

public class p04_Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String command = scanner.nextLine();
        int totalScore = 301;
        int unsuccessfulCount = 0;
        int successfulCount = 0;
        boolean isWinner = false;

        while (!command.equals("Retire")) {
            int score = Integer.parseInt(scanner.nextLine());

            if (command.equals("Double")) {
                score *= 2;
            } else if (command.equals("Triple")) {
                score *= 3;
            }

            if (totalScore < score) {
                unsuccessfulCount++;
                command = scanner.nextLine();
                continue;
            } else {
                successfulCount++;
                totalScore -= score;
            }

            if (totalScore == 0) {
                isWinner = true;
                break;
            }

            command = scanner.nextLine();
        }

        if (isWinner) {
            System.out.printf("%s won the leg with %d shots.%n", name, successfulCount);
        }
        if (command.equals("Retire")) {
            System.out.printf("%s retired after %d unsuccessful shots.%n", name, unsuccessfulCount);
        }
    }
}
