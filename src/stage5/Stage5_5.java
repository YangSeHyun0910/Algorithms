package stage5;

import java.util.Scanner;

public class Stage5_5 {
    public static void main(String[] args) {
        /*
        문제 - 숫자의 합
        N개의 숫자가 공백 없이 쓰여있다.
        이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

        입력
        첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다.
        둘째 줄에 숫자 N개가 공백없이 주어진다.

        출력
        입력으로 주어진 숫자 N개의 합을 출력한다.

        예제 입력 1
        1
        1
        예제 출력 1
        1

        예제 입력 2
        5
        54321
        예제 출력 2
        15

        예제 입력 3
        25
        7000000000000000000000000
        예제 출력 3
        7

        예제 입력 4
        11
        10987654321
        예제 출력 4
        46
        */

        /*
        입력받을 숫자의 갯수를 입력받는다.
        =>반복문을 돌리기 위해서

        숫자를 입력받고, String타입 변수에 할당한다.
        =>입력받은 숫자의 갯수를 공백없이 한 줄로 표현해야하기 때문.

        String타입에 저장된 숫자를 모두 더한다
        =>입력받은 숫자의 갯수만큼 반복문을 실행
        =>String타입의 변수에 .charAt(i)를 사용해서 모든 인덱스의 숫자를 하나씩 컨텍한다
        =>'0' 을 사용해서 아스키 코드값 반환을 대비한다.
        =>'0'의 아스키 코드가 48인가 그렇다. 즉, 숫자를 반환할 수 있도록 아스키 코드 위치 조정함
        =>최종식 : sum += s.charAt(i) - '0'
        */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.nextLine();
        int sum = 0;

        if (n >= 1 && n <= 100) {
            for (int i = 0; i < n; i++) {
                sum += s.charAt(i) - '0';
            }
        }

        System.out.println(sum);
    }
}
