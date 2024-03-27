package stage5;

import java.util.Scanner;

public class Stage5_11 {
    public static void main(String[] args) {
        /*
        문제 - 그대로 출력하기
        입력 받은 대로 출력하는 프로그램을 작성하시오.

        입력
        입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다.
        각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다.  또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.

        출력
        입력받은 그대로 출력한다.

        예제 입력 1
        Hello
        Baekjoon
        Online Judge

        예제 출력 1
        Hello
        Baekjoon
        Online Judge
        */

        /*
        1.입력받은 문자열을 저장하기 위해 변수 선언.
        2.입력받은 문자열들을 하나의 배열에 저장하기 위해 배열형태의 변수 선언.
        */
        Scanner scanner = new Scanner(System.in);
        String s;
        String[] arr = new String[3];

        //입력받을 횟수만큼 반복 진행.
        for (int i = 0; i < 3; i++) {

            //문자열을 입력받는다
            s = scanner.nextLine();

            //입력받은 문자열의 길이가 100자를 초과하면 안되는 조건이 있으므로, break; 설정
            if (s.length() > 100) {
                break;
            }

            //입력받은 문자열의 길이가 100자를 초과하지 않았다면, 배열에 저장
            arr[i] = s;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
