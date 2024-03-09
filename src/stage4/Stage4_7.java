package stage4;

import java.util.Scanner;

public class Stage4_7 {

    public static void main(String[] args) {
        /*
        문제 - 과제 안내신 분?
        X대학 M교수님은 프로그래밍 수업을 맡고 있다.
        교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.
        교수님이 내준 특별과제를 28명이 제출했는데,
        그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.

        입력
        입력은 총 28줄로 각 제출자(학생)의 출석번호 n(1 ≤ n ≤ 30)가 한 줄에 하나씩 주어진다.
        출석번호에 중복은 없다.

        출력
        출력은 2줄이다.
        1번째 줄엔 제출하지 않은 학생의 출석번호 중 가장 작은 것을 출력하고,
        2번째 줄에선 그 다음 출석번호를 출력한다.

        예제 입력 1
        3
        1
        4
        5
        7
        9
        6
        10
        11
        12
        13
        14
        15
        16
        17
        18
        19
        20
        21
        22
        23
        24
        25
        26
        27
        28
        29
        30
        예제 출력 1
        2
        8
        예제 입력 2
        9
        30
        6
        12
        10
        20
        21
        11
        7
        5
        28
        4
        18
        29
        17
        19
        27
        13
        16
        26
        14
        23
        22
        15
        3
        1
        24
        25
        예제 출력 2
        2
        8
        */

        Scanner scanner = new Scanner(System.in);
        // 출석부 총 번호를 arr[30]으로 선언
        // 레포트를 제출한 출석번호 n선언
        // 레포트를 제출한 출석번호를 담는 배열 submit선언
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                     11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                     21, 22 ,23, 24, 25, 26, 27, 28, 29, 30};
        int[] submit = new int[arr.length];
        int n = 0;

        for (int i = 0; i < 28; i++) {
            n = scanner.nextInt();
            if (n >= 1 && n <= 30) {

                // 제출한 학생의 출석부 번호 n과 arr[j]의 값이 일치할 때
                // 제출한 학생 목록에 출석부 번호를 저장
                // submit[j] = arr[j]
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == n) {
                        submit[j] = arr[j];
                    }
                }
            } else {
                break;
            }
        }

        for (int i = 0; i < submit.length; i++) {
            if (submit[i] != arr[i]) {
                System.out.println(arr[i]);
            }
        }
    }
}
