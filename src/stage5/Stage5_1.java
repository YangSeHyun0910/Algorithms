package stage5;

import java.util.Scanner;

public class Stage5_1 {
    public static void main(String[] args) {
        /*
        문제 - 문자와 문자열
        단어 S와 정수 i가 주어졌을 때, S의 i번째 글자를 출력하는 프로그램을 작성하시오

        입력
        첫째 줄에 영어 소문자와 대문자로만 이루어진 단어 S가 주어진다.
        단어의 길이는 최대 1000이다.
        둘째 줄에 정수 i가 주어진다. (1 <= i <= |S|)

        출력
        S의 i번째 글자를 출력한다.

        예제 입력 1
        Sprout
        3
        예제 출력 1
        r

        예제 입력 2
        shiftpsh
        6
        예제 출력 2
        p

        예제 입력 3
        Baekjoon
        4
        예제 출력 3
        k

        노트
        문자열 S에 대해 |S|는 S의 길이를 의미한다
        */
        Scanner scanner = new Scanner(System.in);
        /*
        문자열을 입력받는다
        문자열에서 몇번째 문자를 출력할지 입력받는다
        */
        String S = scanner.nextLine();
        int i = scanner.nextInt();

        /*
        입력받은 문자열의 길이가 조건에 만족하다면
        .substring()메서드를 이용해서 시작값=i-1(인덱스이기 떄문), 종료값=i 로 설정*/
        if (!S.isEmpty() && S.length() <= 1000) {
            System.out.println(S.substring(i-1, i));
        }
    }
}
