import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = 0; //입력받을 정수의 갯수
        int max = -1000001; //최대값 담아 둘 변수
        int min = 1000001; //최소값 담아 둘 변수
        n = scanner.nextInt();
        int[] array = new int[n]; //입력받은 정수를 담아 둘 배열


        if (n >= 1 && n <= 1000000) {
            for (int i = 0, a = 0; i < n; i++) {
                //int a = 0; 을 반복문의 초기식에서 선언 => 1회만 선언됨 => 메모리 낭비 방지
                a = scanner.nextInt();

                //입력받은 정수 a값이 조건 범위에 벗어날 경우 종료.
                if (a < -1000000 || a > 1000000) {
                    break;
                }

                //-1,000,000 <= a <= 1,000,000 라면 배열에 담는다
                array[i] = a;

                if (min > array[i]) {
                    min = array[i];
                }
                if (max < array[i]) {
                    max = array[i];
                }
            }
            System.out.println(min + " " + max);
        }
    }
}