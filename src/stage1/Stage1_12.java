package stage1;

public class Stage1_12 {

    public static void main(String[] args) {
        /*
        아래 예제와 같이 고양이를 출력하시오.
        \    /\
         )  ( ')
        (  /  )
         \(__)|
        */
        for (int i = 0; i < 7; i++) {
            if (i == 0) {
                System.out.print("\\");
                continue;
            }
            if (i == 5) {
                System.out.print("/");
                continue;
            }
            if (i == 6) {
                System.out.print("\\");
            }
            System.out.print(" ");
        }
        System.out.println();

        for (int i = 0; i < 8; i++) {
            if (i == 1) {
                System.out.print(")");
                continue;
            }
            if (i == 4) {
                System.out.print("(");
                continue;
            }
            if (i == 6) {
                System.out.print("'");
                continue;
            }
            if (i == 7) {
                System.out.print(")");
                continue;
            }
            System.out.print(" ");
        }
        System.out.println();

        for (int i = 0; i < 7; i++) {
            if (i == 0) {
                System.out.print("(");
                continue;
            }
            if (i == 3) {
                System.out.print("/");
                continue;
            }
            if (i == 6) {
                System.out.print(")");
                continue;
            }
            System.out.print(" ");
        }
        System.out.println();

        for (int i = 0; i < 7; i++) {
            if (i == 1) {
                System.out.print("\\");
                continue;
            }
            if (i == 2) {
                System.out.print("(");
                continue;
            }
            if (i > 0 && i <= 4) {
                System.out.print("_");
                continue;
            }
            if (i == 5) {
                System.out.print(")");
                continue;
            }
            if (i == 6) {
                System.out.print("|");
                continue;
            }
            System.out.print(" ");
        }
    }
}
