package Exercises;

import java.util.Scanner;

public class p06_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double record = Double.parseDouble(scan.nextLine());
        double metres = Double.parseDouble(scan.nextLine());
        double secondsPerMeter = Double.parseDouble(scan.nextLine());

        double seconds = metres * secondsPerMeter;
        double extraSeconds = Math.floor((metres / 15)) * 12.5;
        double totalSeconds = seconds + extraSeconds;
        double missingSeconds = Math.abs(totalSeconds - record);

        if (totalSeconds < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalSeconds);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", missingSeconds);
        }
    }
}
