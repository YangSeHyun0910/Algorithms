package stage3;

import java.util.Scanner;

public class Stage3_4 {

    public static void main(String[] args) {
        /*
        문제 - 영수증
        준원이는 저번 주에 살면서 처음으로 코스트코를 가 봤다. 정말 멋졌다.
        그런데, 몇 개 담지도 않았는데 수상하게 높은 금액이 나오는 것이다!
        준원이는 영수증을 보면서 정확하게 계산된 것이 맞는지 확인해보려 한다.
        영수증에 적힌,
        구매한 각 물건의 가격과 개수
        구매한 물건들의 총 금액
        을 보고,
        구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.

        입력
        첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다.

        둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.

        이후
        N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.

        출력
        구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다.
        일치하지 않는다면 No를 출력한다.

        제한
        1 ≤ X ≤ 1\,000\,000\,000
        1 ≤ N ≤ 100
        1 ≤ a ≤ 1\,000\,000
        1 ≤ b ≤ 10
        */
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();

        if (x >= 1 && x <= 1000000000 && n >= 1 && n <= 100 ) {
            int[] item = new int[n];
            int[] price = new int[n];
            int sum = 0;

            for (int i = 0, a = 0, b = 0; i < n; i++) {
                a = scanner.nextInt();
                b = scanner.nextInt();
                if (a >= 1 && a <= 1000000 && b >= 1 && b <= 10) {
                    item[i] = a;
                    price[i] = b;
                }
                sum += item[i] * price[i];
            }

            if (x == sum) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
