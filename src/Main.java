import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = 0; //입력받는 정수의 갯수
        int x = 0; //조건 정수. 해당 정수 보다 작은 수를 출력하기 위함
        n = scanner.nextInt();
        x = scanner.nextInt();
        int[] array = new int[n]; //입력받는 정수를 담아 둘 배열

        if (n >= 1 && n <= 10000 & x >= 1 && x <= 10000) {
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (array[i] < x) {
                    System.out.println(array[i]);
                }
            }
        }
    }
}