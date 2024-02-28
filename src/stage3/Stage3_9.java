package stage3;

import java.util.Scanner;

public class Stage3_9 {

    public static void main(String[] args) {
        /*
        문제 - 별 찍기1
        첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

        입력
        첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

        출력
        첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

        예제 입력 1
        5

        예제 출력 1
        *
        **
        ***
        ****
        *****
        */

        /*
        입력받은 n 값에서 -1 -2 ...하면서 반복문의 종료시점을 n으로 설정한다.
        --> 5입력받는다
        --> 5-1 = 4 ~ 종료 5 = 1 (4)
        --> 5-2 = 3 ~ 종료 5 = 2 (3, 4)
        --> 5-3 = 2 ~ 종료 5 = 3 (2, 3, 4)
        위의 진행을 보면, 1 2 3 으로 숫자가 커지는게 보인다. 출력을 숫자값으로 주면 될듯

        n-1을 고정으로 주면서, 반복문이 진행될 때 마다 i값이 증가하므라 -i를 붙여주자
        아래의 진행이 위의 진행과 일치하는 것을 알 수 있다.
        --> n-1-i
        --> 5-1-0 = 4
        --> 5-1-1 = 3
        --> 5-1-2 = 2
        */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n > 0 && n < 101) {
            for (int i = 0; i < n; i++) {
                for (int j = n - 1 - i; j < n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
