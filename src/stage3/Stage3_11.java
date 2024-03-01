package stage3;

import java.util.Scanner;

public class Stage3_11 {

    public static void main(String[] args) {
        /*
        문제 - A+B - 5
        두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

        입력
        입력은 여러 개의 테스트 케이스로 이루어져 있다.

        각 테스트 케이스는 한 줄로 이루어져 있으며,
        각 줄에 A와 B가 주어진다. (0 < A, B < 10)

        입력의 마지막에는 0 두 개가 들어온다.

        출력
        각 테스트 케이스마다 A+B를 출력한다.

        예제 입력 1
        1 1
        2 3
        3 4
        9 8
        5 2
        0 0

        예제 출력 1
        2
        5
        7
        17
        7
        */

        /*
        풀이1.
        a와 b가 각각 0이 입력되지 않으면 계속 a와 b값을 입력받고, 두 수를 합한 값은 모든 입력이 끝난 후 반환한다
        --> 반복문이 진행될 때마다 변수 count 에 값을 1씩 증가시키고, count의 값을 int 타입의 배열 result의 크기로 설정
        ->> 이유, 반복된 횟수만큼 배열을 만들고, 해당 배열에 각 반복문의 결과값(a+B)을 담은 후 출력하기 위해
        --> int count = 0, int[] result = new int[count];
        --> a, b 입력받는 것은 잘 되지만, 그 후 0 < a,b < 10 조건을 만족해도 에러발생.
        --> 배열 선언 초기화에 문제가 있는것으로 판단. 다른방법 모색

        풀이2.
        질문게시판에서 힌트를 얻음
        문제에서는 종료 조건을 만날때까지 a,b 값을 계속 입력받고, 종료 조건이 입력되면 그 후 모든 결과값이 반환한다.
        하지만, 질문게시판에서는 "a,b 입력 후 결과 출력, 다시 a,b 입력 후 출력" 해도 무방하다고 함
        --> 즉,
        --> 1. a,b 입력받는다.
        --> 2. 0 < a,b < 10 or a==0 && b==0 판단.
        --> 3. 0 < a,b < 10 이라면 출력 후 다시 반복문 실행. or a==0 && b==0 이라면 종료(break).

        * */
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int count = 0;
        int[] result = new int[count];

        for (int i = 0; ; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            count += 1;
            if
             (a > 0 && a < 10 && b > 0 && b < 10) {
                System.out.println(a+b);
            }
            if (a == 0 && b == 0) {
                break;
            }
        }
    }
}
