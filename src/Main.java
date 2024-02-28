import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] count = new int[t];
        String[] calc = new String[t];

        for (int i = 0, a, b; i < t; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            if (a > 0 && a < 10 && b > 0 && b < 10) {
                calc[i]= a + " + " + b ;
                count[i] = a + b;
            }
        }

        for (int i = 0; i < count.length; i++) {
            System.out.println("Case #" + (i+1) + ": " + calc[i] + " = " + count[i]);
        }
    }
}