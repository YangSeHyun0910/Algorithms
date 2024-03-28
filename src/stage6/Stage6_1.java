package stage6;

import java.util.Scanner;

public class Stage6_1 {
    public static void main(String[] args) {
        /*
        문제 - 새싹
        입력 받은 대로 출력하는 프로그램을 작성하시오.
        아래 예제와 같이 새싹을 출력하시오.

        입력
        입력은 없다.

        출력
        새싹을 출력한다.

        예제 입력 1

        예제 출력 1
                 ,r'"7
        r`-_   ,'  ,/
         \. ". L_r'
           `~\/
              |
              |
        */

        //첫째 줄
        for (int i = 0; i < 14; i++) {
            if (i == 9) {
                System.out.print(",");
            } else if (i == 10) {
                System.out.print("r");
            } else if (i == 11) {
                System.out.print("'");
            } else if (i == 12) {
                System.out.print('"');
            } else if (i == 13) {
                System.out.println("7");
            } else {
                System.out.print(" ");
            }
        }

        //둘째 줄
        for (int i = 0; i < 14; i++) {
            if (i == 0) {
                System.out.print("r");
            } else if (i == 1) {
                System.out.print("`");
            } else if (i == 2) {
                System.out.print("-");
            } else if (i == 3) {
                System.out.print('_');
            } else if (i > 3 && i < 7) {
                System.out.print(" ");
            } else if (i == 7) {
                System.out.print(",");
            } else if (i == 8) {
                System.out.print("'");
            } else if (i > 8 && i < 11) {
                System.out.print(" ");
            } else if (i == 11) {
                System.out.print(",");
            } else if (i == 12) {
                System.out.println("/");
            }
        }

        //셋째 줄
        for (int i = 0; i < 14; i++) {
            if (i == 0) {
                System.out.print(" ");
            } else if (i == 1) {
                System.out.print("\\");
            } else if (i == 2) {
                System.out.print(".");
            } else if (i == 3) {
                System.out.print(' ');
            } else if (i == 4) {
                System.out.print('"');
            } else if (i == 5) {
                System.out.print(".");
            } else if (i == 6) {
                System.out.print(" ");
            } else if (i == 7) {
                System.out.print("L");
            } else if (i == 8) {
                System.out.print("_");
            } else if (i == 9) {
                System.out.print("r");
            } else if (i == 10) {
                System.out.println("'");
            }
        }

        //넷째 줄
        for (int i = 0; i < 14; i++) {
            if (i >= 0 && i < 3) {
                System.out.print(" ");
            } else if (i == 3) {
                System.out.print("`");
            } else if (i == 4) {
                System.out.print("~");
            } else if (i == 5) {
                System.out.print("\\");
            } else if (i == 6) {
                System.out.println('/');
            }
        }

        //다섯째 줄
        for (int i = 0; i < 14; i++) {
            if (i <= 5) {
                System.out.print(" ");
            } else if (i == 6) {
                System.out.println("|");
            }
        }

        //여섯째 줄
        for (int i = 0; i < 14; i++) {
            if (i <= 5) {
                System.out.print(" ");
            } else if (i == 6) {
                System.out.println("|");
            }
        }
    }
}
