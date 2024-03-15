import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        if (!s.isEmpty() && s.length() <= 100) {
            System.out.println(s.length());
        }
    }
}