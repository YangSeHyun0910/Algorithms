package stage3;

import java.util.Scanner;

public class Stage3_12 {

    public static void main(String[] args) {
        /*
        문제 - A+B - 4
        두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

        입력
        입력은 여러 개의 테스트 케이스로 이루어져 있다.
        각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다.
        (0 < A, B < 10)

        출력
        각 테스트 케이스마다 A+B를 출력한다.

        예제 입력 1
        1 1
        2 3
        3 4
        9 8
        5 2
        예제 출력 1
        2
        5
        7
        17
        7
        /*
        특별한 종료값을 입력받지않고, 입력한 값이 있고, 입력받은 값이 정수라면, 두 수를 합하고 결과 반환
        단, 정수를 입력받지 않는다면 종료.
        EOF를 알아보자. end of file -> 파일의 끝, 즉 더이상 읽을 데이터가 없는 상태.
        ** .hasNext()
        --> 입력값이 존재하는지 여부를 true, false로 반환한다
        --> 단, 타입에 따라 다르다
        --> scanner.hasNext() 모든 타입 입력값을 인식
        --> scanner.hasNextInt() 라면, 정수 이외엔 false 반환
        --> scanner.hasNextLine() 이라면, 문자열 인식
        --> 단, hasNext() 메서드가 true 반환 후, 코드가 진행될 때
            에러가 발생할 수 있으므로 타입을 맞춰야한다.
            ex) .hasNextInt()로 결과를 받환 받으면, 다음코드는 nextInt()가 되어야한다
         */
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        while (scanner.hasNextInt()) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            if (a > 0 && a < 10 && b > 0 && b < 10) {
                System.out.println(a+b);
            }
        }
    }
}
