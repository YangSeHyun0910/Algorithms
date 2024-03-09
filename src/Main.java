import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        // 나머지가 서로 같지 않은 수의 갯수 count 선언
        int[] arr = new int[10];
        int count = 10;

        for (int i = 0, n = 0; i < arr.length; i++) {
            n = scanner.nextInt();
            if (n > 0 && n <= 1000) {
                arr[i] = n%42;
            } else {
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    continue;
                } else {
                    count -= 1;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}