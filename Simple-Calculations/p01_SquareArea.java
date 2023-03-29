import java.util.Scanner;

public class p01_SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");
        int a = Integer.parseInt(scanner.nextLine());
        double area = Math.pow(a, 2);
        System.out.print("Square = ");
        System.out.printf("%.0f", area);
    }
}
