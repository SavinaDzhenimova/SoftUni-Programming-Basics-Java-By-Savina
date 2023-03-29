package Exam_2019_15_16_June;

import java.util.Scanner;

public class p02_MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int time = Integer.parseInt(scanner.nextLine());
        int scenes = Integer.parseInt(scanner.nextLine());
        int durationForScene = Integer.parseInt(scanner.nextLine());

        double preparation = time * 0.15;
        double timeForScenes = scenes * durationForScene;
        double neededTime = preparation + timeForScenes;

        if (neededTime <= time) {
            System.out.printf("You managed to finish the movie on time! You have %d minutes left!",
                    Math.round(time - neededTime));
        } else {
            System.out.printf("Time is up! To complete the movie you need %d minutes.",
                    Math.round(neededTime - time));
        }
    }
}
