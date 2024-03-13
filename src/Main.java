import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        /*
        총 과목수를 입력받는다.
        과목당 점수를 한군데에 담아두기 위해 배열을 선언
        가장 높은 수를 저장할 변수 선언
        점수 / 가장높은수 * 100 의 값을 저장할 변수 선언
        평균값을 계산하고 저장할 변수 선언
        double 타입으로 선언한 이유
        max = 가장 높은 점수는 각 과목당 나누어주고, 그 값이 소숫점으로 나오기 때문에
              int 타입이면 0이 되기 때문에. => 10/30 => 0.3333333 => int 타입이면 0됨.
        sum = max를 사용해서
        */
        int n = scanner.nextInt();
        int[] arr = new int[n];
        double max = 0;
        int sum = 0;
        double average = 0;

        if (n <= 1000) {
            for (int i = 0, a = 0; i < n; i++) {
                a = scanner.nextInt();

                //입력받은 점수가 조건에 만족하면 배열에 담는다. 아니면 코드를 종료.
                if (a <= 100 && a >= 0) {
                    arr[i] = a;
                } else {
                    break;
                }
            }

            for (int i = 0; i < n; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }

            for (int i = 0; i < n; i++) {
                sum += ((arr[i] / max) * 100);
            }

            average = sum/n;
            System.out.println(average);
        }

    }
}