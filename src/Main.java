import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        if (H >= 0 && H <= 23 && M >= 0 && M <= 59) {
            if (M - 45 < 0) {
                H -= 1;
                M += 60 - 45;
                if (H < 0) {
                    H = 23;
                }
                System.out.println(H + " " + M);
            } else {
                M -= 45;
                System.out.println(H + " " + M);
            }
        }
    }
}