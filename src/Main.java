import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
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

                //arr[]의 구조는 알파벳의 갯수 = 총 26
                //=>아스키코드 구조 A~Z = 65~90
                //=>즉, max < arr[i]을 만족할때, resultString에 저장될 문자를 구하는 식은
                //=>i+65를 문자로 변환해 줘야한다.
                resultString = String.valueOf((char)(i+65));
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