import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];

        if (n > 0 && n < 101 && m > 0 && m < 101) {
            for (int a = 0, i = 0, j = 0, k = 0; a < m; a++) {
                i = scanner.nextInt();
                j = scanner.nextInt();
                k = scanner.nextInt();
                if (i >= 1 && j >= i && n >= j && k >= 1 && n >= k) {
                    for (int b = i - 1; b < j; b++) {
                        arr[b] = k;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}