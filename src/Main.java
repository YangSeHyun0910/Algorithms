import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int i = scanner.nextInt();

        if (!S.isEmpty() && S.length() <= 1000) {
            System.out.println(S.substring(i-1, i));
        }

    }
}