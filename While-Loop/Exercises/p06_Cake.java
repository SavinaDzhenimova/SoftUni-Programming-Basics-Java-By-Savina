package Exercises;

import java.util.Scanner;

public class p06_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int availablePieces = width * length;
        String takenPieces = scanner.nextLine();
        boolean isTaken = false;

        while (!takenPieces.equals("STOP")) {
            int input = Integer.parseInt(takenPieces);
            availablePieces -= input;

            if (availablePieces <= 0) {
                isTaken = true;
                break;
            }

            takenPieces = scanner.nextLine();
        }

        if (isTaken) {
            System.out.printf("No more cake left! You need %d pieces more.%n", Math.abs(availablePieces));
        } else {
            System.out.printf("%d pieces are left.%n", availablePieces);
        }
    }
}
