//Revers

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        reverseArray(array, 0, n - 1);
        printArray(array);
    }

    public static void reverseArray(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverseArray(arr, left + 1, right - 1);
    }

    public static void printArray(int[] arr) {
        printArrayRecursive(arr, 0);
        System.out.println();
    }

    public static void printArrayRecursive(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        System.out.print(arr[index] + " ");
        printArrayRecursive(arr, index + 1);
    }
}
