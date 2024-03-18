package stage5;

import java.util.Scanner;

public class Stage5_4 {
    public static void main(String[] args) {
        /*
        문제 - 아스키 코드
        알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때,
        주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

        입력
        알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.

        출력
        입력으로 주어진 글자의 아스키 코드 값을 출력한다.

        예제 입력 1
        A
        예제 출력 1
        65

        예제 입력 2
        C
        예제 출력 2
        67

        예제 입력 3
        0
        예제 출력 3
        48

        예제 입력 4
        9
        예제 출력 4
        57

        예제 입력 5
        a
        예제 출력 5
        97

        예제 입력 6
        z
        예제 출력 6
        122
        */

        /*
        소문자, 대문자, 숫자0~9 중 하나를 입력받는다.
        =>하나만 입력받기 위해 char타입의 변수를 선언
        =>입력받는 값을 nextLine().charAt(0)을 설정
        =>charAt(0) = 입력받은 단어의 0번째 인덱스를 의미 즉, 하나의 입력값이라는 의미
        =>입력받은 값을 아스키 코드로 변환하기 위해서는 해당 문자를 숫자로 바꿔야함
        => int타입 변수에 입력받은 문자를 int타입으로 형변환 후 저장
        */
        Scanner scanner = new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
        int ascii = (int)a;
        System.out.println(ascii);
    }
}
