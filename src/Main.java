import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
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