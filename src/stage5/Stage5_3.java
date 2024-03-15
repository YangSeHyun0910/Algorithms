package stage5;

import java.util.Scanner;

public class Stage5_3 {
    public static void main(String[] args) {
        /*
        문제 - 문자열
        문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.

        입력
        입력의 첫 줄에는 테스트 케이스의 개수 T(1 ≤ T ≤ 10)가 주어진다.
        각 테스트 케이스는 한 줄에 하나의 문자열이 주어진다.
        문자열은 알파벳 A~Z 대문자로 이루어지며 알파벳 사이에 공백은 없으며 문자열의 길이는 1000보다 작다.

        출력
        각 테스트 케이스에 대해서 주어진 문자열의 첫 글자와 마지막 글자를 연속하여 출력한다.

        예제 입력 1
        3
        ACDKJFOWIEGHE
        O
        AB

        예제 출력 1
        AE
        OO
        AB
        */

        /*
        입력받은 문자열에서 첫 문자와 마지막 문자를 출력하므로
        char타입의 배열을 2개 만든다 (첫 문자용, 마지막 문자용)
        * */
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        char[] s = new char[t];
        char[] e = new char[t];
        String a;


        if (t > 0 && t < 11) {
            for (int i = 0; i < t; i++) {
                a = scanner.nextLine();

                /*
                입력받은 문자열 a를 하나씩 고를 수 있도록 a.charAt() 메서드 사용
                시작 = 0 (인덱스 번호)
                끝 = a.length - 1 (인덱스 번호)
                각각 배열에 넣어둔다.
                */
                if (!a.isEmpty() && a.length() <= 1000) {
                    s[i] = a.charAt(0);
                    e[i] = a.charAt(a.length() - 1);
                }else {
                    break;
                }
            }

            for (int i = 0; i < t; i++) {
                System.out.print(s[i]);
                System.out.println(e[i]);
            }
        }
    }
}
