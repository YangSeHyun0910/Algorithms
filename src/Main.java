import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        char[] s = new char[t];
        char[] e = new char[t];
        String a;


        if (t > 0 && t < 11) {
            for (int i = 0; i < t; i++) {
                a = scanner.nextLine();

                /*
                입력받은 문자열 a를 하나씩 고를 수 있도록 a.charAt() 메서드 사용
                시작 = 0 (인덱스 번호)
                끝 = a.length - 1 (인덱스 번호)
                각각 배열에 넣어둔다.
                */
                if (!a.isEmpty() && a.length() <= 1000) {
                    s[i] = a.charAt(0);
                    e[i] = a.charAt(a.length() - 1);
                }else {
                    break;
                }
            }

            for (int i = 0; i < t; i++) {
                System.out.print(s[i]);
                System.out.println(e[i]);
            }
        }
    }
}