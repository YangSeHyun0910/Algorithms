import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
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