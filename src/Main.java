import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();

        if (!s.isEmpty() && s.length() <= 100) {
            for (int i = 97; i < 123; i++) {
                for (int j = 0; j < s.length(); j++) {
                    if (i == s.charAt(j)) {
                        System.out.print(j + " ");
                        break;
                    }else if (j + 1 == s.length()) {
                        System.out.print(-1 + " ");
                    }
                }
            }
        }
    }
}