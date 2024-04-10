package stage6;

import java.util.Arrays;
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
        1.문자열을 입력받는다.
        2.입력받은 문자열을 대문자로 전환.
        3.배열의 크기가 26(알파벳 갯수)인 int타입의 배열 선언
        4.문자열에 해당 문자가 중복된 갯수를 알기 위한 변수 선언 => count
        5.가장 많은 중복 갯수를 알기위한 변수 선언 => max
        6.가장 많이 중복된 갯수가 여러개인지 아닌지 알기위한 변수 선언 => result
        7.가장 많은 중복 갯수를 알아 냈을때, 해당 문자를 대문자로 변환해서 저장할 변수 선언 => resultString
        */
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String ss = s.toUpperCase();
        int[] arr = new int[26];
        int count = 0;
        int max = 0;
        int result = 0;
        String resultString = null;

        //알파벳 대문자 A~Z까지를 아스키코드로 변환하여 반복문 실행
        for (int i = 65; i < 91; i++) {

            //입력받은 문자열이 어떤 알파벳으로 구성 되어있는지 확인하기 위한 반복문 실행
            for (int j = 0; j < s.length(); j++) {

                //해당 문자가 일치하는 알파벳을 만났을때, arr[]에 알파벳 위치에 count 수 저장
                //=>저장된 count(수) 는 max를 구할때 사용 될 예정
                if (ss.charAt(j) == i) {
                    count++;
                    arr[i-65] = count;
                }
            }
            count = 0;
        }

        //arr[]에서 가장 큰 값을 찾기 위한 반복문.
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                resultString = String.valueOf(ss.charAt(i));
            }
        }

        //max값이 arr[]에 일치하는게 몇개 인지 확인하기 위한 반복문
        //=> arr[]에 max값은 최소 1개 있다.
        //=> 하지만, result값이 2 이상이 된다면? max값이 중복이라는 의미
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                result += 1;
            }
        }

        if (result > 1) {
            System.out.println("?");
        } else {
            System.out.println(resultString);
        }
    }
}
