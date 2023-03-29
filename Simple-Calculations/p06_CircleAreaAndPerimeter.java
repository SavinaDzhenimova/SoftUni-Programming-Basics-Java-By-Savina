import java.util.Scanner;

public class p06_CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());
        double area = Math.PI * r * r;
        System.out.println("Area = " + area);
        double perimeter = Math.PI * r * 2;
        System.out.println("Perimeter = " + perimeter);
    }
}
