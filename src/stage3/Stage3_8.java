package stage3;

import java.util.Scanner;

public class Stage3_8 {

    public static void main(String[] args) {
        /*
        문제 - A+B - 8
        두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

        입력
        첫째 줄에 테스트 케이스의 개수 T가 주어진다.

        각 테스트 케이스는 한 줄로 이루어져 있으며,
        각 줄에 A와 B가 주어진다. (0 < A, B < 10)

        출력
        각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다.
        x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.

        예제 입력 1
        5
        1 1
        2 3
        3 4
        9 8
        5 2
        예제 출력 1
        Case #1: 1 + 1 = 2
        Case #2: 2 + 3 = 5
        Case #3: 3 + 4 = 7
        Case #4: 9 + 8 = 17
        Case #5: 5 + 2 = 7
        */

        /*
        1. 연산식의 총 갯수 t를 입력받는다 --> int t = scanner.nextInt();
        2. t 갯수만큼의 int 타입의 배열, Strig 타입의 배열을 만든다 --> int[] count = new int[t]; String[] calc = new String[t];
        3. 입력받은 t만큼 반복문을 진행한다 --> for (int i = 0, a, b; i < t; i++)
        4. 3번의 반복문이 실행될 때 마다 a, b값을 입력받는다 --> a = scanner.nextInt(); b = scanner.nextInt();
        (단, 반복의 시작값 변수와 a, b는 1회만 선언되면 되기 때문에 초기식에 넣는다. 안그러면 매 반복때마다 a,b 변수가 선언되는 불필요성이 생김)
        5. 매 반복시에 0 < a,b < 10 이라면
           배열 calc[i]에 계산식을 저장 --> calc[i]= a + " + " + b ; --> String 타입
           배열 count[i]에 a+b값을 저장 --> count[i] = a + b; --> int 타입
        6. 저장된 배열 calc 와 배열 count[]를 처음부터 마지막까지 출력.
        (단, index 는 0부터 시작이므로 출력할때, +1을 붙여서 숫자 1부터 출력되도록 한다)
        * */
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] count = new int[t];
        String[] calc = new String[t];

        for (int i = 0, a, b; i < t; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            if (a > 0 && a < 10 && b > 0 && b < 10) {
                calc[i]= a + " + " + b ;
                count[i] = a + b;
            }
        }

        for (int i = 0; i < count.length; i++) {
            System.out.println("Case #" + (i+1) + ": " + calc[i] + " = " + count[i]);
        }
    }
}
