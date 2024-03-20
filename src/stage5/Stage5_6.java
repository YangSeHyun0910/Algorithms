package stage5;

import java.util.Scanner;

public class Stage5_6 {
    public static void main(String[] args) {
        /*
        문제 - 알파벳 찾기
        알파벳 소문자로만 이루어진 단어 S가 주어진다.
        각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

        입력
        첫째 줄에 단어 S가 주어진다.
        단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

        출력
        각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
        만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다.
        단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.

        예제 입력 1
        baekjoon
        예제 출력 1
        1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
        a b  c  d e  f  g  h  i j k  l  m n o  p  q  r  s  t  u  v  w  x  y  z
        */

        /*
        영어를 입력받는다.
        입력받은 영어를 소문자로 변환한다.
        입력받은 문자열의 길이를 확인하고,
        아스키코드 소문자 a~z까지의 값을 반복문의 시작, 종료 값으로 설정
        입력받은 문자열의 인덱스만큼 중첩 반복문을 실행.
        ex) 아스키코드 97(a)와 입력받은 문자열의 모든 인덱스가 일치하는지 확인
        =>i == s.charAt(j) ??
        => i=97~122, s.charAt(j)=입력받은 문자열의 각각의 인덱스의 영어 소문자의 아스키코드값
        => i == s.charAt(J) true 라면? j값 반환 => j = 인덱스 번호.
        => i == s.charAt(J) false 라면? -1 반환 => i(해당하는 소문자)값이 입력받은 문자열에 포함되어 있지 않다.
        */
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();

        if (!s.isEmpty() && s.length() <= 100) {
            for (int i = 97; i < 123; i++) {
                for (int j = 0; j < s.length(); j++) {
                    if (i == s.charAt(j)) {
                        System.out.print(j + " ");
                        break;
                    }else if (j + 1 == s.length()) {
                        System.out.print(-1 + " ");
                    }
                }
            }
        }
    }
}
