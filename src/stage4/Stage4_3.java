package stage4;

import java.util.Scanner;

public class Stage4_3 {

    public static void main(String[] args) {
        /*
        문제 - 최소, 최대
        N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

        입력
        첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
        둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
        모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

        출력
        첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.

        예제 입력 1
        5
        20 10 35 30 7

        예제 출력 1
        7 35
        */
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
