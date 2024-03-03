package stage4;

import java.util.Scanner;

public class Stage4_1 {

    public static void main(String[] args) {
        /*
        문제 - 개수 세기
        총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.

        입력
        첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다.
        둘째 줄에는 정수가 공백으로 구분되어져있다.
        셋째 줄에는 찾으려고 하는 정수 v가 주어진다.
        입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.

        출력
        첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.

        예제 입력 1
        11
        1 4 1 2 4 2 4 2 3 4 4
        2

        예제 출력 1
        3

        예제 입력 2
        11
        1 4 1 2 4 2 4 2 3 4 4
        5

        예제 출력 2
        0
        */
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
