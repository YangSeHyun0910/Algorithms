import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        /*
        총 바구니 갯수, 역순으로 바꿀 횟수를 입력받는다
        총 바구니 갯수 만큼의 배열을 만든다
        치환을 위한 변수 temp 선언
        */
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        int count = 0;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = 1 + i;
        }

        for (int a = 0, i = 0, j = 0; a < m; a++) {
            i = scanner.nextInt();
            j = scanner.nextInt();
            if (i >= 1 && i <= j && j <= n) {
                if (i - j > 0) {
                    count = i - j;

                } else if (j - i > 0) {
                    count = j - i;

                }
                for (int b = 0; b < count; b++, i++, j--) {
                    if (i > j) {
                        continue;
                    }
                    temp = arr[i-1];
                    arr[i-1] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}