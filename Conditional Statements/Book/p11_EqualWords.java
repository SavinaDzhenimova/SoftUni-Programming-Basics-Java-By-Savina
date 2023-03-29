import java.util.Scanner;

public class p11_EqualWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wordFirst = scanner.next().toLowerCase();
        String wordSecond = scanner.next().toLowerCase();

        if (wordFirst.equals(wordSecond)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
