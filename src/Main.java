import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;

        while (scanner.hasNext()) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            if (a > 0 && a < 10 && b > 0 && b < 10) {
                System.out.println(a+b);
            }
        }
    }
}