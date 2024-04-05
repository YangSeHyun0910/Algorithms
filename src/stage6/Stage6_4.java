package stage6;

import java.util.Scanner;

public class Stage6_4 {

    public static void main(String[] args) {
        /*
        문제 - 팰린드롬인지 확인하기

        알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
        팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.
        level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.

        입력
        첫째 줄에 단어가 주어진다.
        단어의 길이는 1보다 크거나 같고, 100보다 작거나 같으며, 알파벳 소문자로만 이루어져 있다.

        출력
        첫째 줄에 팰린드롬이면 1, 아니면 0을 출력한다.

        예제 입력 1
        level
        예제 출력 1
        1
        예제 입력 2
        baekjoon
        예제 출력 2
        0
        */

        /*
        1. 문자열을 입력받는다.
        2. 입력받은 문자열을 소문자로 변환한다.
        3. 앞으로 읽어도, 뒤로 읽어도 같아야 하기 때문에 정방향과 비교 할 뒤집은 문자열을 담을 변수 reverse 선언
        4. 정방향, 역방향 모두 같다는 의미는 문자열 중에서 각각의 위치의 문자가 모두 같다는 것을 의미
        => 입력받은 문자열의 length만큼 일치하는 문자의 갯수가 존재한다는 의미와 같음
        => ex) noon(정방향) == noon(역방향) => 각각의 위치의 문자가 서로 같음.
        =>     noon의 length = 4, 위치가 같은 문자 = 4개
        => 일치하는 문자의 갯수를 확인 할 변수 count 선언
        */
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        String reverse = "";
        int count = 0;

        //입력받은 문자열을 뒤집어서 저장한다.
        //문자열의 뒤부터 입력받아야하기 때문에 시작 : s.length() - 1 => index이기 때문에 -1 해 줌
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }

        //문자열의 정방향과 역방향을 비교해서 팰린드롬인지 확인.
        //각각의 위치의 문자가 일치하면 count의 수를 1씩 증가
        //=> 이유? s.length() == count 인지 확인하기 위해서.
        //=> (s.charAt(i) == reverse.charAt(i)) 거짓이면 반복문을 바로 탈출.
        //=> 이유? 팰린드롬이 아니기 때문에 더 이상 진행할 필요X
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == reverse.charAt(i)) {
                count += 1;
            } else {
                break;
            }
        }

        //입력받은 문자열이 팰린드롬인지 확인
        //확인방법 : s.length() == count 인지
        if (s.length() == count) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
