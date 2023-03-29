package Exam_2019_6_7_July;

import java.util.Scanner;

public class p06_TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int maxScore = 0;
        String winner = "";

        while (!word.equals("End of words")) {
            int totalScore = 0;

            for (int i = 0; i < word.length(); i++) {
                int letterScore = word.codePointAt(i);
                totalScore += letterScore;
            }
            if (word.charAt(0) == 'a' || word.charAt(0) == 'A') {
                totalScore *= word.length();
            } else if (word.charAt(0) == 'e' || word.charAt(0) == 'E') {
                totalScore *= word.length();
            } else if (word.charAt(0) == 'i' || word.charAt(0) == 'I') {
                totalScore *= word.length();
            } else if (word.charAt(0) == 'o' || word.charAt(0) == 'O') {
                totalScore *= word.length();
            } else if (word.charAt(0) == 'u' || word.charAt(0) == 'U') {
                totalScore *= word.length();
            } else if (word.charAt(0) == 'y' || word.charAt(0) == 'Y') {
                totalScore *= word.length();
            } else {
                totalScore /= word.length();
            }

            if (totalScore > maxScore) {
                maxScore = totalScore;
                winner = word;
            }

            word = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %.0f%n", winner, Math.floor(maxScore));
    }
}
