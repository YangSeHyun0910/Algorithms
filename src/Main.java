import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();

        if (x >= 1 && x <= 1000000000 && n >= 1 && n <= 100 ) {
            int[] item = new int[n];
            int[] price = new int[n];
            int sum = 0;

            for (int i = 0, a = 0, b = 0; i < n; i++) {
                a = scanner.nextInt();
                b = scanner.nextInt();
                if (a >= 1 && a <= 1000000 && b >= 1 && b <= 10) {
                    item[i] = a;
                    price[i] = b;
                }
                sum += item[i] * price[i];
            }

            if (x == sum) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}