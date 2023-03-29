package Exam_2020_28_29_March;

import java.util.Scanner;

public class p02_MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());

        double neededSeconds = distanceInMeters * secondsPerMeter;
        double delay = Math.floor(distanceInMeters / 50) * 30;
        double totalTime = neededSeconds + delay;

        if (totalTime < recordInSeconds) {
            System.out.printf("Yes! The new record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", totalTime - recordInSeconds);
        }
    }
}
