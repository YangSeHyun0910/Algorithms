package stage4;

import java.util.Scanner;

public class Stage4_5 {

    public static void main(String[] args) {
        /*
        문제 - 공 넣기
        도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다.
        또, 1번부터 N번까지 번호가 적혀있는 공을 매우 많이 가지고 있다.
        가장 처음 바구니에는 공이 들어있지 않으며, 바구니에는 공을 1개만 넣을 수 있다.
        도현이는 앞으로 M번 공을 넣으려고 한다.
        도현이는 한 번 공을 넣을 때, 공을 넣을 바구니 범위를 정하고, 정한 바구니에 모두 같은 번호가 적혀있는 공을 넣는다.
        만약, 바구니에 공이 이미 있는 경우에는 들어있는 공을 빼고, 새로 공을 넣는다. 공을 넣을 바구니는 연속되어 있어야 한다.
        공을 어떻게 넣을지가 주어졌을 때, M번 공을 넣은 이후에 각 바구니에 어떤 공이 들어 있는지 구하는 프로그램을 작성하시오.

        입력
        첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
        둘째 줄부터 M개의 줄에 걸쳐서 공을 넣는 방법이 주어진다.
        각 방법은 세 정수 i j k로 이루어져 있으며, i번 바구니부터 j번 바구니까지에 k번 번호가 적혀져 있는 공을 넣는다는 뜻이다.
        예를 들어, 2 5 6은 2번 바구니부터 5번 바구니까지에 6번 공을 넣는다는 뜻이다. (1 ≤ i ≤ j ≤ N, 1 ≤ k ≤ N)
        도현이는 입력으로 주어진 순서대로 공을 넣는다.

        출력
        1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다. 공이 들어있지 않은 바구니는 0을 출력한다.

        예제 입력 1
        5 4
        1 2 3
        3 4 4
        1 4 1
        2 2 2

        예제 출력 1
        1 2 1 1 0
        */
        Scanner scanner = new Scanner(System.in);
        // 바구니 갯수 n, 공을 넣을 횟수 m
        // 바구니 갯수만큼 배열로 선언
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];

        // 주어진 조건에 맞는지 if 문으로 확인.
        if (n > 0 && n < 101 && m > 0 && m < 101) {

            // 시작바구니 i, 종료바구니 j, 넣을 공 번호 k 를 => 공 넣을 횟수 m만큼 반복
            for (int a = 0, i = 0, j = 0, k = 0; a < m; a++) {
                i = scanner.nextInt();
                j = scanner.nextInt();
                k = scanner.nextInt();

                // 각 반복마다 입력된 i,j,k값이 조건에 맞는지 if문으로 확인
                if (i >= 1 && j >= i && n >= j && k >= 1 && n >= k) {

                    // 시작바구니 i 부터 종료바구니 j 까지 횟수로 반복.
                    for (int b = i - 1; b < j; b++) {

                        // 반복할 때 마다 해당 바구니에 공을 넣을 번호 k 할당.
                        arr[b] = k;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
