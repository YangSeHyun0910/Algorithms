package stage2;

import java.util.Scanner;

public class Stage2_1 {

    public static void main(String[] args) {
        /*
        문제
        두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.

        입력
        첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.

        출력
        첫째 줄에 다음 세 가지 중 하나를 출력한다.
        A가 B보다 큰 경우에는 '>'를 출력한다.
        A가 B보다 작은 경우에는 '<'를 출력한다.
        A와 B가 같은 경우에는 '=='를 출력한다.

        제한
        -10,000 ≤ A, B ≤ 10,000
        */
        Scanner scanner = new Scanner(System.in);


        /*
        이렇게 답을 적은 이유
        -10,000 ≤ A, B ≤ 10,000 조건을 확인하는 if문 필요
        -10,000 ≤ A, B ≤ 10,000 조건 불만족시 다시 입력받아야함.
        */
        for (; ;) {
            System.out.print("A값을 입력하세요(-10,0000 <= A <= 10,0000) : ");
            int A = scanner.nextInt();
            if (A < -10000 || A > 10000) {
                System.out.println("범위를 벗어났습니다. 재입력하세요.");
                continue;
            }

            System.out.print("B값을 입력하세요(-10,0000 <= B <= 10,0000) : ");
            int B = scanner.nextInt();
            if (B < -10000 || B > 10000) {
                System.out.println("범위를 벗어났습니다. 재입력하세요.");
                continue;
            }

            String result = A > B ? ">" : A < B ? "<" : "==";

            System.out.println(result);
            break;
        }

        /*
        제출 답안
        일단.. 쓸데없는 코드 없어야함
        ex) System.out.println("두 수를 입력하세요.");
        */
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A >= -10000 && A <= 10000 && B >= -10000 && B <= 10000) {
            if (A > B) {
                System.out.println(">");
            } else if (A < B) {
                System.out.println("<");
            } else {
                System.out.println("==");
            }
        }
    }
}
