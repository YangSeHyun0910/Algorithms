package stage4;

import java.util.Scanner;

public class Stage4_2 {

    public static void main(String[] args) {
        /*
        문제 - X보다 작은 수
        정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
        이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

        입력
        첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
        둘째 줄에 수열 A를 이루는 정수 N개가 주어진다.
        주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.

        출력
        X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다.
        X보다 작은 수는 적어도 하나 존재한다.

        예제 입력 1
        10 5
        1 10 4 9 2 3 8 5 7 6
        예제 출력 1
        1 4 2 3
        */
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
