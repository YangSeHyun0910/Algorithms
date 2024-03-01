import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int count = 0;
        int[] result = new int[count];

        for (int i = 0; ; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            count += 1;
            if
            (a > 0 && a < 10 && b > 0 && b < 10) {
                System.out.println(a+b);
            }
            if (a == 0 && b == 0) {
                break;
            }
        }
    }
}