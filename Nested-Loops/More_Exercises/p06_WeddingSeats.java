package More_Exercises;

import java.util.Scanner;

public class p06_WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char lastSector = scanner.nextLine().charAt(0);
        int firstSectorSeats = Integer.parseInt(scanner.nextLine());
        int oddRowSeats = Integer.parseInt(scanner.nextLine());
        int evenRowSeats = oddRowSeats + 2;
        int count = 0;

        for (char a = 'A'; a <= lastSector; a++) {
            for (int b = 1; b <= firstSectorSeats; b++) {
                if (b % 2 != 0) {
                    for (char c = 'a'; c < 'a' + oddRowSeats; c++) {
                        System.out.printf("%c%d%c%n", a, b, c);
                        count++;
                    }
                } else {
                    for (char c = 'a'; c < 'a' + evenRowSeats; c++) {
                        System.out.printf("%c%d%c%n", a, b, c);
                        count++;
                    }
                }
            }
            firstSectorSeats++;
        }
        System.out.printf("%d%n", count);
    }
}
