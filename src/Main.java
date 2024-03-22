import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
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