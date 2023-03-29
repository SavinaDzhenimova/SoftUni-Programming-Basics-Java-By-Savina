package Exam_2019_9_10_March;

import java.util.Scanner;

public class p02_Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutes = Integer.parseInt(scanner.nextLine());
        int seconds = Integer.parseInt(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        int secondsFor100Meters = Integer.parseInt(scanner.nextLine());

        int timeInSeconds = minutes * 60 + seconds;
        double decrease = length / 120;
        double decreasedTime = decrease * 2.5;
        double totalTime = (length / 100) * secondsFor100Meters - decreasedTime;

        if (totalTime <= timeInSeconds) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.03f.", totalTime);
        } else {
            System.out.printf("No, Marin failed! He was %.03f second slower.", totalTime - timeInSeconds);
        }
    }
}
