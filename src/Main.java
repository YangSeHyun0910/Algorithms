import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n > 0 && n < 101) {
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    System.out.print(" ");
                }
                for (int q = 0; q < i + 1; q++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}