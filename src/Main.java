import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = 0; //총 입력받는 정수 갯수
        int num = 0; //입력받는 정수. -100 <= num <= 100
        int v = 0; //입력받은 정수의 배열에서 원하는 숫자를 찾기위한 변수
        int count = 0; //배열 array에서 v와 일치하는 값이 몇개인지 확인하는 변수
        n = scanner.nextInt();
        int[] array = new int[n]; //입력받은 정수를 담아 둘 배열

        if (n >= 1 && n <= 100) {
            for (int i = 0; i < n; i++) {
                num = scanner.nextInt();
                if (num >= -100 && num <= 100) {
                    array[i] = num;
                }
            }
        }

        v = scanner.nextInt();
        if (v >= -100 && v <= 100) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == v) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}