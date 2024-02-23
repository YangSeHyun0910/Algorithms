import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a >= 0 && a <= 23 && b >= 0 && b <= 59 && c >= 0 && c <= 1000) {
            if (b + c >= 60) {
                a = a + ((b + c) / 60) ;
                b = (b + c) % 60;

                if (a > 23) {
                    a -= 24;
                }
                System.out.println(a + " " + b);
            } else {
                b += c;
                System.out.println(a + " " + b);
            }
        }
    }
}