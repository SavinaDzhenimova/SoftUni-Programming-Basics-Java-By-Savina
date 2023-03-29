import java.util.Scanner;

public class p02_InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inches: ");
        double inches = Double.parseDouble(scanner.nextLine());
        double centimeters = inches * 2.54;
        System.out.print("Centimeters: " + centimeters);
    }
}
