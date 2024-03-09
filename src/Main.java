import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        // 출석부 총 번호를 arr[30]으로 선언
        // 레포트를 제출한 출석번호 n선언
        // 레포트를 제출한 출석번호를 담는 배열 submit선언
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22 ,23, 24, 25, 26, 27, 28, 29, 30};
        int[] submit = new int[arr.length];
        int n = 0;

        for (int i = 0; i < 28; i++) {
            n = scanner.nextInt();
            if (n >= 1 && n <= 30) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == n) {
                        submit[j] = arr[j];
                    }
                }
            } else {
                break;
            }
        }

        for (int i = 0; i < submit.length; i++) {
            if (submit[i] != arr[i]) {
                System.out.println(arr[i]);
            }
        }
    }
}