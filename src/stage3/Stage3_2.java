package stage3;

import java.util.Scanner;

public class Stage3_2 {

    public static void main(String[] args) {
        /*
        문제 - A+B - 3
        두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

        입력
        첫째 줄에 테스트 케이스의 개수 T가 주어진다.

        각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

        출력
        각 테스트 케이스마다 A+B를 출력한다.
         */

        /*
        1. 테스트 횟수를 입력받는다
        2. 입력받은 테스트 횟수를 배열의 길이로 설정한다.
        3. for()문으로 반복문 수행. 입력받은 횟수만큼
        4. 반복횟수마다 수행된 코드의 결과값을 배열에 담는다.
        5. 또 다른 for()문으로 반복문 수행. 배열 result의 값을 하나씩 출력
        */
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] result = new int[count];

        for (int i = 0; i < count; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            result[i] = a+b;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
