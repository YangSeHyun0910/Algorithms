import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
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