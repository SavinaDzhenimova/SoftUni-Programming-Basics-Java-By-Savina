import java.text.DecimalFormat;
import java.util.Scanner;

public class p07_2DRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x= Math.max(x1, x2) - Math.min(x1, x2);
        double y = Math.max(y1, y2) - Math.min(y1, y2);
        DecimalFormat decimalFormat = new DecimalFormat("#.#########");
        System.out.println(decimalFormat.format(x * y));
        System.out.println(decimalFormat.format(2 * (x + y)));
    }
}
