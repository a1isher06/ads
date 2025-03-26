//factorial
import java.util.Scanner;

public class Main4 {
    public static int factorial(int n) {
        if (n<=1) return 1;
        return factorial(n-1)*n;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}


