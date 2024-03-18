import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        int sum = 0;

        if (n >= 1 && n <= 100) {
            for (int i = 0; i < n; i++) {
                sum += s.charAt(i) - '0';
            }
        }

        System.out.println(sum);
    }
}