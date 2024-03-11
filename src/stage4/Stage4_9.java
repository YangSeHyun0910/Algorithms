package stage4;

import java.util.Scanner;

public class Stage4_9 {

    public static void main(String[] args) {
        /*
        문제 - 바구니 뒤집기
        도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 순서대로 적혀져 있다.
        바구니는 일렬로 놓여져 있고, 가장 왼쪽 바구니를 1번째 바구니, 그 다음 바구니를 2번째 바구니, ..., 가장 오른쪽 바구니를 N번째 바구니라고 부른다.
        도현이는 앞으로 M번 바구니의 순서를 역순으로 만들려고 한다.
        도현이는 한 번 순서를 역순으로 바꿀 때, 순서를 역순으로 만들 범위를 정하고, 그 범위에 들어있는 바구니의 순서를 역순으로 만든다.
        바구니의 순서를 어떻게 바꿀지 주어졌을 때, M번 바구니의 순서를 역순으로 만든 다음, 바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력하는 프로그램을 작성하시오.

        입력
        첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
        둘째 줄부터 M개의 줄에는 바구니의 순서를 역순으로 만드는 방법이 주어진다.
        방법은 i j로 나타내고, 왼쪽으로부터 i번째 바구니부터 j번째 바구니의 순서를 역순으로 만든다는 뜻이다.
        (1 ≤ i ≤ j ≤ N)
        도현이는 입력으로 주어진 순서대로 바구니의 순서를 바꾼다.

        출력
        모든 순서를 바꾼 다음에, 가장 왼쪽에 있는 바구니부터 바구니에 적혀있는 순서를 공백으로 구분해 출력한다.

        예제 입력 1
        5 4
        1 2
        3 4
        1 4
        2 2

        예제 출력 1
        3 4 1 2 5
        */
        Scanner scanner = new Scanner(System.in);
        /*
        총 바구니 갯수, 역순으로 바꿀 횟수를 입력받는다
        총 바구니 갯수 만큼의 배열을 만든다
        치환을 위한 변수 temp 선언
        */
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        int count = 0;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = 1 + i;
        }

        for (int a = 0, i = 0, j = 0; a < m; a++) {
            i = scanner.nextInt();
            j = scanner.nextInt();
            if (i >= 1 && i <= j && j <= n) {
                if (i - j > 0) {
                    count = i - j;
                } else if (j - i > 0) {
                    count = j - i;
                } else {
                    continue;
                }

                if (count < 3) {
                    for (int b = 0; b < count; b++) {
                        temp = arr[i + b - 1];
                        arr[i + b - 1] = arr[j - b - 1];
                        arr[j - b - 1] = temp;
                    }
                } else {
                    for (int b = 0; b < count-1; b++) {
                        temp = arr[i + b - 1];
                        arr[i + b - 1] = arr[j - b - 1];
                        arr[j - b - 1] = temp;
                    }
                }

            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}