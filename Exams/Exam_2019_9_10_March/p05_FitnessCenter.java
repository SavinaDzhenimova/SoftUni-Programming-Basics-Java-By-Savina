package Exam_2019_9_10_March;

import java.util.Scanner;

public class p05_FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int visitors = Integer.parseInt(scanner.nextLine());

        int back = 0;
        int chest = 0;
        int legs = 0;
        int abs = 0;
        int proteinBar = 0;
        int proteinShake = 0;
        int peopleToTrain = 0;
        int peopleToBuyProtein = 0;

        for (int i = 1; i <= visitors; i++) {
            String activity = scanner.nextLine();

            switch (activity) {
                case "Back":
                    back++;
                    break;
                case "Chest":
                    chest++;
                    break;
                case "Legs":
                    legs++;
                    break;
                case "Abs":
                    abs++;
                    break;
                case "Protein bar":
                    proteinBar++;
                    break;
                case "Protein shake":
                    proteinShake++;
                    break;
            }

            if (activity.equals("Protein shake") || activity.equals("Protein bar")) {
                peopleToBuyProtein++;
            } else {
                peopleToTrain++;
            }
        }

        double percentToTrain = (peopleToTrain * 1.00 / visitors) * 100;
        double percentToBuyProtein = (peopleToBuyProtein * 1.00 / visitors) * 100;

        System.out.printf("%d - back%n", back);
        System.out.printf("%d - chest%n", chest);
        System.out.printf("%d - legs%n", legs);
        System.out.printf("%d - abs%n", abs);
        System.out.printf("%d - protein shake%n", proteinShake);
        System.out.printf("%d - protein bar%n", proteinBar);
        System.out.printf("%.2f%% - work out%n", percentToTrain);
        System.out.printf("%.2f%% - protein%n", percentToBuyProtein);
    }
}
