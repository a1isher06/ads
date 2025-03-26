//avg
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = scanner.nextInt();
        int [] array = new int[n];
        for (int i = 0;i<n;i++) {
            array[i]=scanner.nextInt();
        }
        double sum=0;
        for (int i = 0;i<n;i++) {
            sum+=array[i];
        }

        double avg=sum/n;

        System.out.println(avg);

    }
}