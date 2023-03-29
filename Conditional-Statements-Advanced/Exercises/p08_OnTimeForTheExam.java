package Exercises;

import java.util.Scanner;

public class p08_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        int examTimeMinutes = examHour * 60 + examMinutes;
        int arrivalTimeMinutes = arrivalHour * 60 + arrivalMinutes;
        int diff = Math.abs(arrivalTimeMinutes - examTimeMinutes);

        if (arrivalTimeMinutes > examTimeMinutes) {
            System.out.println("Late");
            if (diff < 60) {
                System.out.printf("%d minutes after the start", diff);
            } else {
                int hours = diff /60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours after the start", hours, minutes);
            }
        } else if (diff <= 30) {
            System.out.println("On time");
            if (examTimeMinutes != arrivalTimeMinutes) {
                System.out.printf("%d minutes before the start", diff);
            }
        } else {
            System.out.println("Early");
            if (diff < 60) {
                System.out.printf("%d minutes before the start", diff);
            } else {
                int hours = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours before the start", hours, minutes);
            }
        }
    }
}
