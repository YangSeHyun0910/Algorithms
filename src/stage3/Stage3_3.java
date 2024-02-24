package stage3;

import java.util.Scanner;

public class Stage3_3 {

    public static void main(String[] args) {
        /*
        문제 - 합
        n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

        입력
        첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

        출력
        1부터 n까지 합을 출력한다.
        */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        if (n >= 1 && n <= 10000) {
            for (int i = 0; i < n; i++) {
                sum += i + 1;
            }
        }
        System.out.println(sum);
    }
}
