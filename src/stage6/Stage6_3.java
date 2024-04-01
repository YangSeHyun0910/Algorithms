package stage6;

import java.util.Scanner;

public class Stage6_3 {

    public static void main(String[] args) {
        /*
        문제 - 별 찍기 -7

        예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

        입력
        첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

        출력
        첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

        예제 입력 1
        5
        예제 출력 1
            *
           ***
          *****
         *******
        *********
         *******
          *****
           ***
            *
        */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //1. 총 2*n-1 번 만큼 반복을 해야한다
        //2. 입력받은 n을 기준으로 미만=오름차순, 초과=내림차순으로 별 출력.
        if (n >= 1 && n <= 100) {
            for (int i = 0; i < (2 * n) - 1; i++) {
                if (i < n) {
                    for (int j = 0; j < n+i; j++) {
                        if (j + i < n) {
                            System.out.print(" ");
                        }

                        if (j + i >= n) {
                            System.out.print("*");
                        }
                    }
                }
                System.out.println();
            }

        }
    }
}
