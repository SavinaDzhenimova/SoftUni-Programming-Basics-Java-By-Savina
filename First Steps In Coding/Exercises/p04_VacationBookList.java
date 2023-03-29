package Exercises;

import java.util.Scanner;

public class p04_VacationBookList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pages = Integer.parseInt(scan.nextLine());
        int pagesPerHour = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());

        int totalTime = pages / pagesPerHour;
        int hoursPerDay = totalTime / days;

        System.out.println(hoursPerDay);
    }
}
