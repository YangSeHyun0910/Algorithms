import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        /*
        EOF를 활용하자
        1.입력받은 문자열을 저장하기 위해 변수 선언.
        2.입력받는 횟수(줄 수)는 최대 100줄이기 때문에 int타입의 변수 선언.
        */
        Scanner scanner = new Scanner(System.in);
        String s;
        int line = 0;

        //EOF = End Of File의 약어
        //while문을 활용해서 조건에 hasNextLine()과 입력 줄 수 최대 100까지 설정
        while (scanner.hasNextLine() && line <=100) {

            //문자열을 입력받는다
            s = scanner.nextLine();

            //입력받은 문자열의 길이가 100을 초과하지 않는다면 출력.
            if (s.length() <= 100) {
                System.out.println(s);
            } else {
                //초과하면 끝.
                break;
            }

            //입력줄수의 상태를 1씩 증가시킨다.
            //=>입력 성공 => line = 0 + 1 = 1
            //=>입력 성공 => line = 1 + 1 = 2
            line += 1;
        }
    }
}