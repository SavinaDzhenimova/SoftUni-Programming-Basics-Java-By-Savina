package Exam_2020_18_19_July;

import java.util.Scanner;

public class p04_Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int red = 0;
        int orange = 0;
        int yellow = 0;
        int white = 0;
        int black = 0;
        int others = 0;
        double score = 0;

        for (int i = 1; i <= n; i++) {
            String color = scanner.nextLine();

            switch (color) {
                case "red":
                    red++;
                    score += 5;
                    break;
                case "orange":
                    orange++;
                    score += 10;
                    break;
                case "yellow":
                    yellow++;
                    score += 15;
                    break;
                case "white":
                    white++;
                    score += 20;
                    break;
                case "black":
                    black++;
                    score = Math.floor(score / 2);
                    break;
                default:
                    others++;
                    break;
            }
        }

        System.out.printf("Total points: %.0f%n", score);
        System.out.printf("Red balls: %d%n", red);
        System.out.printf("Orange balls: %d%n", orange);
        System.out.printf("Yellow balls: %d%n", yellow);
        System.out.printf("White balls: %d%n", white);
        System.out.printf("Other colors picked: %d%n", others);
        System.out.printf("Divides from black balls: %d%n", black);
    }
}
