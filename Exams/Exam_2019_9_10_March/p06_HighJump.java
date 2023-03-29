package Exam_2019_9_10_March;

import java.util.Scanner;

public class p06_HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetHeight = Integer.parseInt(scanner.nextLine());
        int startHeight = targetHeight - 30;
        int jumps = 0;
        boolean isFailed = false;

        while (startHeight <= targetHeight) {
            for (int i = 1; i <= 3; i++) {
                int currentJump = Integer.parseInt(scanner.nextLine());
                jumps++;
                if (currentJump > startHeight) {
                    startHeight += 5;
                    break;
                }
                if (i == 3) {
                    System.out.printf("Tihomir failed at %dcm after %d jumps.%n", startHeight, jumps);
                    isFailed = true;
                }
            }
            if (isFailed) {
                break;
            }
        }
        if (!isFailed) {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.%n", targetHeight, jumps);
        }
    }
}
