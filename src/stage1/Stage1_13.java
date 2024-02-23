package stage1;

public class Stage1_13 {

    public static void main(String[] args) {
        /*
        아래 예제와 같이 개를 출력하세요
        |\_/|
        |q p|   /}
        ( 0 )"""\
        |"^"`    |
        ||_/=\\__|
        */
        for (int i = 0; ; i++) {
            if (i == 0 || i == 4) {
                System.out.print("|");
                if (i == 4) {
                    break;
                }
                continue;
            }
            if (i == 1) {
                System.out.print("\\");
                continue;
            }
            if (i == 2) {
                System.out.print("_");
                continue;
            }
            if (i == 3) {
                System.out.print("/");
                continue;
            }
        }
        System.out.println();


        for (int i = 0; ; i++) {
            if (i == 0 || i == 4) {
                System.out.print("|");
                continue;
            }
            if (i == 1) {
                System.out.print("q");
                continue;
            }
            if (i == 2) {
                System.out.print(" ");
                continue;
            }
            if (i == 3) {
                System.out.print("p");
                continue;
            }
            if (i == 8) {
                System.out.print("/");
                continue;
            }
            if (i == 9) {
                System.out.print("}");
                break;
            }
            System.out.print(" ");
        }
        System.out.println();

        for (int i = 0; ; i++) {
            if (i == 0) {
                System.out.print("(");
                continue;
            }
            if (i == 2) {
                System.out.print("0");
                continue;
            }
            if (i == 4) {
                System.out.print(")");
                continue;
            }
            if (i > 4 && i < 8) {
                System.out.print('"');
                continue;
            }
            if (i == 8) {
                System.out.print("\\");
                break;
            }
            System.out.print(" ");
        }
        System.out.println();

        for (int i = 0; ; i++) {
            if (i == 0 || i == 9) {
                System.out.print("|");
                if (i == 9) {
                    break;
                }
                continue;
            }
            if (i == 1 || i == 3) {
                System.out.print('"');
                continue;
            }
            if (i == 2) {
                System.out.print("^");
                continue;
            }
            if (i == 4) {
                System.out.print("`");
                continue;
            }
            System.out.print(" ");
        }
        System.out.println();

        for (int i = 0; ; i++) {
            if (i == 0 || i == 1 || i == 9) {
                System.out.print("|");
                if (i == 9) {
                    break;
                }
                continue;
            }
            if (i == 2 || i >= 7) {
                System.out.print("_");
                continue;
            }
            if (i == 3) {
                System.out.print("/");
                continue;
            }
            if (i == 4) {
                System.out.print("=");
                continue;
            }
            System.out.print("\\");
        }
    }
}
