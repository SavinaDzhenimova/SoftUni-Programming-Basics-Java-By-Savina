import java.util.Scanner;

public class p14_TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int totalMins = hours * 60 + minutes + 15;
        double newHours = Math.floor(totalMins / 60);
        int newMins = totalMins % 60;

        if (newHours == 24) {
            newHours = 0;
            if (newMins < 10) {
                System.out.printf("%.0f:0%d", newHours, newMins);
            } else {
                System.out.printf("%.0f:%d", newHours, newMins);
            }
        } else if (newMins < 10) {
            System.out.printf("%.0f:0%d", newHours, newMins);
        } else {
            System.out.printf("%.0f:%d", newHours, newMins);
        }
    }
}
