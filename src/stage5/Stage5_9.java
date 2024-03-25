package stage5;

import java.util.Scanner;

public class Stage5_9 {
    public static void main(String[] args) {
        /*
        문제 - 상수
        상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다.
        이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다.
        상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.
        상수는 수를 다른 사람과 다르게 거꾸로 읽는다.
        예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다.
        따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
        두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.

        입력
        첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다.
        두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.

        출력
        첫째 줄에 상수의 대답을 출력한다.

        예제 입력 1
        734 893
        예제 출력 1
        437

        예제 입력 2
        221 231
        예제 출력 2
        132

        예제 입력 3
        839 237
        예제 출력 3
        938
        */

        /*
        1. 두 수 를 입력받는다.
        2. 입력받은 두 수를 각각 뒤집어서 저장할 변수 선언
        */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int aa = 0;
        int bb = 0;

        //조건에 맞으면 진입
        if (a >= 100 && a <= 999 && b >= 100 && b <= 999) {
            // %(나머지)연산자와 /(몫)연산자를 이용해서 해결해보자.
            //1. %연산자를 이용해서 입력된 수의 1의자리 수를 찾는다
            //2. 1번 결과에 100을 곱해줌으로써 1의 자릿수가 100의자리 숫자가 되도록 한다.
            aa += a%10 * 100;
            bb += b%10 * 100;

            //3. 1의 자릿수는 끝이 났고, 다음 십의 자릿수를 알기위해서
            //   몫 연산자를 사용해서 입력받은 수에서 1의자리 숫자를 없앤다.
            a = a/10;
            b = b/10;

            //4. 위의 1,2번 과정을 동일하게 진행하는데, 10의 자릿수를 찾는거기 때문에
            //   곱하기 10을 해준다.
            aa += a%10 * 10;
            bb += b%10 * 10;

            //5. 3번 과정과 동일하다. 100의 자릿수를 찾기위해서
            //   3번 과정으로 두 자릿수가 된 입력받은 수를 다시 10으로 나누어준다
            a = a/10;
            b = b/10;

            //6. 1,2번 과정을 반복한다.
            aa += a%10;
            bb += b%10;

            //삼항식으로 높은 수를 찾아서 반환
            System.out.println(aa > bb ? aa : bb);
        }
    }
}