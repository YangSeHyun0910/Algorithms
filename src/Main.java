import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
        int ascii = (int)a;
        System.out.println(ascii);
    }
}