package Exam_2019_15_16_June;

import java.util.Scanner;

public class p05_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyScore = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String evaluatorName = scanner.nextLine();
            double evaluatorScore = Double.parseDouble(scanner.nextLine());

            academyScore += ((evaluatorName.length() * evaluatorScore) / 2);

            if (academyScore >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!%n", actorName, academyScore);
                break;
            }
        }

        if (academyScore < 1250.5){
            double diff = 1250.5 - academyScore;
            System.out.printf("Sorry, %s you need %.1f more!%n", actorName, diff);
        }
    }
}
