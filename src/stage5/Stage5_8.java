package stage5;

import java.util.Scanner;

public class Stage5_8 {
    public static void main(String[] args) {
        /*
        문제 - 단어의 개수
        영어 대소문자와 공백으로 이루어진 문자열이 주어진다.
        이 문자열에는 몇 개의 단어가 있을까?
        이를 구하는 프로그램을 작성하시오.
        단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.

        입력
        첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다.
        이 문자열의 길이는 1,000,000을 넘지 않는다.
        단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다.
        또한 문자열은 공백으로 시작하거나 끝날 수 있다.

        출력
        첫째 줄에 단어의 개수를 출력한다.

        예제 입력 1
        The Curious Case of Benjamin Button
        예제 출력 1
        6

        예제 입력 2
         The first character is a blank
        예제 출력 2
        6

        예제 입력 3
        The last character is a blank
        예제 출력 3
        6
        */

        /*
        1. 문자열을 입력받는다.
        2. 입력받은 문자열에서 공백(" ")을 기준으로 나누어서, 단어 단위로 배열에 할당.
        3. 단어의 갯수를 저장할 변수 선언 (count)
        */
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] arr = s.split(" ");
        int count = 0;

        //2번을 수행한 후, 배열의 크기(단어의 갯수)만큼 반복문 실행
        for (int i = 0; i < arr.length; i++) {
            //반복할때마다 단어 갯수 1씩 증가
            count += 1;

            //인덱스의 값이 공백("")이라면 단어 갯수(count) -1
            if (arr[i].equals("")) {
                count --;
            }
        }
        System.out.println(count);
    }
}
