import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int r = 0;
        String s;
        String ss = "";
        String[] arr = new String[count];

        if (count >= 1 && count <= 1000) {
            for (int i = 0; i < count; i++) {
                r = scanner.nextInt();
                s = scanner.next();
                scanner.nextLine();

                if (!s.isEmpty() && s.length() <= 20) {
                    for (int j = 0; j < s.length(); j++) {
                        for (int k = 0; k < r; k++) {
                            ss += s.charAt(j);
                        }
                    }
                    arr[i] = ss;
                }
                ss = "";
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}