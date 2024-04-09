package stage6;

import java.util.Scanner;

public class Stage6_5 {

    public static void main(String[] args) {
        /*
        문제 - 단어 공부
        알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
        단, 대문자와 소문자를 구분하지 않는다.

        입력
        첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다.
        주어지는 단어의 길이는 1,000,000을 넘지 않는다.

        출력
        첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
        단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

        예제 입력 1
        Mississipi
        예제 출력 1
        ?

        예제 입력 2
        zZa
        예제 출력 2
        Z

        예제 입력 3
        z
        예제 출력 3
        Z

        예제 입력 4
        baaa
        예제 출력 4
        A
        */

        /*
        1. 문자열을 입력받는다.
        2. 입력받은 문자열의 길이만큼의 int타입의 배열을 선언한다.
        3. 입력받은 문자열에서 각각의 문자가 중복되는지 확인하기 위한 변수(count) 선언
        4. 가장 많이 중복된 횟수를 저장하기 위한 변수(max) 선언
        5. 가장 많이 중복된 횟수를 가진 문자가 몇개인지 확인하기 위한 변수(result) 선언
        */
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        int[] arr = new int[s.length()];
        String ss = null;
        int count = 0;
        int max = 0;
        int result = 0;

        if (s.length() <= 1000000) {

            //중첩 반목문을 활용해서 문자열을 각각의 문자로 나누어서 비교
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j < s.length(); j++) {

                    //똑같은 문자 발견시, count값을 1씩 증가
                    //=> 그리고 int타입의 배열에 문자열의 위치에 count값 저장.
                    if (s.charAt(i) == s.charAt(j)) {
                        count += 1;
                        arr[i] = count;
                    }
                }

                //1개의 문자가 모든 문자들과 비교가 끝나면 count값 0으로 초기화
                count = 0;
            }

            //가장 많이 중복된 단어와 단어의 위치를 알기위한 반복문
            for (int i = 0; i < arr.length; i++) {

                //max값을 0으로 설정해 놓고, 문자열의 각각의 문자위치의 중복값을 저장한 count의 값 비교
                //높은수가 갱신 될 때마다, max에 저장. ss(문자를 알기위함)에 문자 저장
                if (max < arr[i]) {
                    max = arr[i];
                    ss = String.valueOf(s.charAt(i));
                }
            }

            for (int i = 0; i < arr.length; i++) {
                if (max == arr[i]) {
                    result += 1;
                }
            }

            if (result > 1) {
                System.out.println("?");
            } else {
                System.out.println(ss);
            }
        }
    }
}
