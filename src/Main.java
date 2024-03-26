import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
                /*
        1. 문자열을 입력받는다. 입력받은 문자열을 대문자로 변환한다.
        2. 입력받은 문자열의 길이만큼의 int타입의 배열을 선언한다,
        => 문자열의 각각의 문자를 숫자로 변환하고, 변환된 숫자를 담아두기 위해서
        3. 다이얼을 돌리는 총 시간을 저장할 변수 선언.
        */
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toUpperCase();
        int[] arr = new int[s.length()];
        int sec = 0;

        //조건에 맞으면 진입
        if (s.length() >= 2 && s.length() <= 15) {

            //문자열의 각각의 문자에 대한 아스키 코드값을 확인 후 1~9 숫자 중 하나로 변환.
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= 65 && s.charAt(i) <= 67) { //ABC
                    arr[i] = 2;
                } else if (s.charAt(i) >= 68 && s.charAt(i) <= 70) { //DEF
                    arr[i] = 3;
                } else if (s.charAt(i) >= 71 && s.charAt(i) <= 73) { //GHI
                    arr[i] = 4;
                } else if (s.charAt(i) >= 74 && s.charAt(i) <= 76) { //JKL
                    arr[i] = 5;
                } else if (s.charAt(i) >= 77 && s.charAt(i) <= 79) { //MNO
                    arr[i] = 6;
                } else if (s.charAt(i) >= 80 && s.charAt(i) <= 83) { //PQRS
                    arr[i] = 7;
                } else if (s.charAt(i) >= 84 && s.charAt(i) <= 86) { //TUV
                    arr[i] = 8;
                } else if (s.charAt(i) >= 87 && s.charAt(i) <= 90) { //WXYZ
                    arr[i] = 9;
                }
            }
        }

        /*
        int타입의 배열에 저장된 숫자의 크기를 구별해서 다이얼을 돌리는 시간으로 변환.
        다이얼 1 = 2초
        다이얼이 2이상이라면, 다이얼의 숫자 1초를 더한다.
        ex) 다이얼이 154 라면,
        => 1 = 2초
        => 5 = 6초
        => 4 = 5초
        => 총 13초
        */
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1) {
                sec += arr[i] + 1;
            } else if (arr[i] == 1){
                sec += 2;
            }
        }

        System.out.println(sec);
    }
}