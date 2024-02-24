import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] result = new int[count];

        for (int i = 0; i < count; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            result[i] = a+b;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}