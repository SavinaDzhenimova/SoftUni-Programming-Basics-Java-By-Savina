package Lab;

import java.util.Scanner;

public class p07_WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String workDay = scanner.nextLine();

        boolean isWorkingDay = workDay.equals("Monday") ||
                workDay.equals("Tuesday") ||
                workDay.equals("Wednesday") ||
                workDay.equals("Thursday") ||
                workDay.equals("Friday") ||
                workDay.equals("Saturday");

        boolean isWorkingHour = hour >= 10 && hour <= 18;

        if (isWorkingDay && isWorkingHour) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
}
