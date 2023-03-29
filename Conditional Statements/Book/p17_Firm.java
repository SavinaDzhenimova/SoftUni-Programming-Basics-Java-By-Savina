import java.util.Scanner;

public class p17_Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededHours = Integer.parseInt(scanner.nextLine());
        int availableDays = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double workDays = availableDays * 0.9;
        var workHours = workDays * 8 * workers;
        double overtime = workers * workDays * 2;
        double totalFirmTime = Math.floor(workHours + overtime);
        double diff = Math.abs(totalFirmTime - neededHours);
        if (neededHours <= totalFirmTime) {
            System.out.printf("Yes!%.0f hours left.", (diff));
        }
        else {
            System.out.printf("Not enough time!%.0f hours needed.",Math.ceil(diff));
        }
    }
}
