//Binomial coeff

import java.util.Scanner;

public class Main9 {
    public static int binomialCoeff(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println("C(" + n + "," + k + ") = " + binomialCoeff(n, k));
        scanner.close();
    }
}
