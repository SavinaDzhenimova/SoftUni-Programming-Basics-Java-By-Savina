package More_Exercises;

import java.util.Scanner;

public class p02_SleepyTomCat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int restDays = Integer.parseInt(scan.nextLine());

        int playInRestDays = restDays * 127;
        int playInWorkDays = (365 - restDays) * 63;
        int realPlayTime = playInRestDays + playInWorkDays;
        int remainingTime = Math.abs(30000 - realPlayTime);
        int remainingHours = remainingTime / 60;
        int remainingMinutes = remainingTime % 60;

        if (realPlayTime > 30000) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", remainingHours, remainingMinutes);
        } else if (realPlayTime < 30000) {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", remainingHours, remainingMinutes);
        }
    }
}
