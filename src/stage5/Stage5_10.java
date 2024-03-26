package stage5;

import java.util.Scanner;

public class Stage5_10 {
    public static void main(String[] args) {
        /*
        문제 - 다이얼
        오래된 다이얼 전화기가 있다
        전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다.
        숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.
        숫자 1을 걸려면 총 2초가 필요하다.
        1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
        상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다.
        즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다.
        예를 들어, UNUCIC는 868242와 같다.
        할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.

        입력
        첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다.
        단어의 길이는 2보다 크거나 같고, 15보다 작거나 같다.

        출력
        첫째 줄에 다이얼을 걸기 위해서 필요한 최소 시간을 출력한다.

        예제 입력 1
        WA
        예제 출력 1
        13

        예제 입력 2
        UNUCIC
        예제 출력 2
        36
        */

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
