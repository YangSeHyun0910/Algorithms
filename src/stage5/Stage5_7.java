package stage5;

import java.util.Scanner;

public class Stage5_7 {
    public static void main(String[] args) {
        /*
        문제 - 문자열 반복
        문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
        즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다.
        S에는 QR Code "alphanumeric" 문자만 들어있다.
        QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.

        입력
        첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다.
        각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다.

        출력
        각 테스트 케이스에 대해 P를 출력한다.

        예제 입력 1
        2
        3 ABC
        5 /HTP

        예제 출력 1
        AAABBBCCC
        /////HHHHHTTTTTPPPPP
        */

        /*
        테스트 갯수를 입력받는다
        각 테스트의 반복횟수와 문자열을 입력받는다
        반복횟수 변수 r
        문자열 변수 s
        입력받은 문자열의 각각의 문자를 반복횟수만큼 반복하며, 새로 생성된 문자열을 저장할 변수 ss
        최종 ss를 담아둘 String타입의 배열 arr 선언
        */
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int r = 0;
        String s;
        String ss = "";
        String[] arr = new String[t];

        if (t >= 1 && t <= 1000) {
            for (int i = 0; i < t; i++) {
                //반복횟수(r)와 문자열(s)는 한 줄에 공백으로 구분되어 있기 때문에
                //s = nextLine(); 이 아닌, next();로 입력받는다.
                r = scanner.nextInt();
                s = scanner.next();
                scanner.nextLine();

                //테스트 갯수 t개를 1부터 반복하여 수행하면서,
                //입력된 문자열(s)의 각각의 문자를 r번 만큼 반복해서 새로운 문자열로 재생성.
                if (!s.isEmpty() && s.length() <= 20) {
                    for (int j = 0; j < s.length(); j++) {
                        for (int k = 0; k < r; k++) {
                            ss += s.charAt(j);
                        }
                    }

                    //재생성 완료된 문자열을 배열(arr[])에 저장
                    arr[i] = ss;
                }
                //다음 입력받은 문자열(s)를 다시 재생성 해야하기 때문에 빈 문자열("")로 초기화
                ss = "";
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
