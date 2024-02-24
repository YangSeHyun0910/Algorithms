package stage1;

import java.util.Scanner;

public class Stage1_11 {

    public static void main(String[] args) {
        /*
        꼬마 정민이는 이제 A + B 정도는 쉽계 계산할 수 있다.
        이제 A + B + C를 계산할 차례이다!

        첫 번째 줄에 A, B, C( 1<= A, B, C <=10의 12승)이 공백을 사이에 두고 주어진다.
        A + B + C이 값을 출력한다.

        입력 예시
        77 77 7777

        출력 예시
        7931
        */

        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();
        if (A >= 1 && B >= 1 && C >= 1) {
            long sum = A + B + C;
            System.out.println(sum);
        }

    }
}
