package stage6;

import java.util.Scanner;

public class Stage6_2 {

    public static void main(String[] args) {
        /*
        문제 - 킹, 퀸, 룩, 비숍, 나이트, 폰
        동혁이는 오래된 창고를 뒤지다가 낡은 체스판과 피스를 발견했다.
        체스판의 먼지를 털어내고 걸레로 닦으니 그럭저럭 쓸만한 체스판이 되었다.
        하지만, 검정색 피스는 모두 있었으나, 흰색 피스는 개수가 올바르지 않았다.
        체스는 총 16개의 피스를 사용하며,
        킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
        동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.

        입력
        첫째 줄에 동혁이가 찾은 흰색 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수가 주어진다.
        이 값은 0보다 크거나 같고 10보다 작거나 같은 정수이다.

        출력
        첫째 줄에 입력에서 주어진 순서대로 몇 개의 피스를 더하거나 빼야 되는지를 출력한다. 만약 수가 양수라면 동혁이는 그 개수 만큼 피스를 더해야 하는 것이고, 음수라면 제거해야 하는 것이다.

        예제 입력 1
        0 1 2 2 2 7
        예제 출력 1
        1 0 0 0 0 1

        예제 입력 2
        2 1 2 1 2 1
        예제 출력 2
        -1 0 0 1 0 7
        */

        /*
        1.킹, 퀸, 룩, 비숍, 나이트, 폰 총 6개의 정수를 담아 둘 배열 선언
        */
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];
        int[] count = new int[6];

        //각각의 체스말의 갯수를 입력받기 위해 6번 반복 실행
        for (int i = 0, a = 0; i < 6; i++) {
            a = scanner.nextInt();
            if (a >= 0 && a <= 10) {
                arr[i] = a;
                count[i] = 0;
            } else {
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 10; j++) {
                if (i <= 1) {
                    if (arr[i] == 1 || count[i] == 1) {
                        break;
                    } else if (arr[i] >= 2 && arr[i] <= 10) {
                        count[i] = count[i] - 1;
                        arr[i] = arr[i] - 1;
                        continue;
                    } else if (arr[i] <= 0) {
                        count[i] = count[i] + 1;
                        arr[i] = arr[i] + 1;
                        continue;
                    }
                } else if (i >= 2 && i <= 4) {
                    if (arr[i] == 2 || count[i] == 2) {
                        break;
                    } else if (arr[i] >= 3 && arr[i] <= 10) {
                        count[i] = count[i] - 1;
                        arr[i] = arr[i] - 1;
                        continue;
                    } else if (arr[i] < 2) {
                        count[i] = count[i] + 1;
                        arr[i] = arr[i] + 1;
                        continue;
                    }
                } else {
                    if (arr[i] == 8 || count[i] == 8) {
                        break;
                    } else if (arr[i] >= 9 && arr[i] <= 10) {
                        count[i] = count[i] - 1;
                        arr[i] = arr[i] - 1;
                        continue;
                    } else if (arr[i] < 8) {
                        count[i] = count[i] + 1;
                        arr[i] = arr[i] + 1;
                        continue;
                    }
                }
            }
        }

        for (int i = 0; i < count.length; i++) {
            System.out.print(count[i] + " ");
        }
    }
}
