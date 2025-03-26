//Degree
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(number(a, n));
    }

    public static int number(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * number(a, n - 1);
    }
}