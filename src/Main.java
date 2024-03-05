import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt(); //문제에 9개의 정수가 주어진다고 설정되어 있기 때문에 "입력받을 정수"라는 의미의 변수가 필요X
        int max = 0; //최대값 변수
        int location = 0; //최대값의 위치 변수
        int[] arr = new int[9];


        //9번 입력받기 위한 반복문
        for (int i = 0, a =0; i < arr.length; i++) {
            a = scanner.nextInt();
            if (a < 100) {
                arr[i] = a;
            } else {
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                location = i + 1;
                continue;
            }
        }
        System.out.println(max);
        System.out.println(location);
    }
}