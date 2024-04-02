import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //1. 총 2*n-1 번 만큼 반복을 해야한다
        //2. 입력받은 n을 기준으로 미만=오름차순, 초과=내림차순으로 별 출력.
        if (n >= 1 && n <= 100) {
            //입력받은 수 만큼 n번 만큼 줄을 오름차순으로 출력 후, n+1번 줄부터는 내림차순으로 출력한다 (대칭)
            //=>(n*2)-1 만큼 반복을 시킨다
            for (int i = 0; i < (2 * n) - 1; i++) {

                //오름차순 출력의 기준을 n으로.
                if (i < n) {

                    //줄당 출력 갯수가, 첫번째 줄=n, 두번째 줄=n+1, 세번째 줄=n+2....
                    //한 줄 늘어날 때 마다, 해당 줄의 출력 갯수가 1개씩 증가 하기 때문에 종료시점을 j < n+i
                    for (int j = 0; j < n + i; j++) {

                        //공백 + 별(*) 순서이기 때문에
                        //공백 공백 공백 별... 이 출력될 수 있도록 조건설정
                        if (j + i < n - 1) {
                            System.out.print(" ");
                        } else if (j + i >= n - 1) {
                            System.out.print("*");
                        }
                    }
                }

                //출력 줄 수가 입력값 n보다 크거나 같아 졌을때 내림차순으로 반전되어야 한다.
                if (i >= n) {

                    //내림차순이기 때문에 시작값을 (2 * n) - 1 으로 설정
                    for (int j = (2 * n) - 1; j > 1; j--) {


                        if (j - i + (n - 1) > 0) {

                            //공백 + 별(*) 순서로 출력되어야한다.
                            //또한, 공백의 수가 1,2,3... 으로 증가된다.
                            //고정값=n, 증가=i, 감소=j
                            //고정값 n을 활용해서 변동값인 i, j을 통해 조건 성립.
                            if ((n * 2) - i + (n - 1) <= j) {
                                System.out.print(" ");
                            } else if (j - i + (n - 1) >= n - (n - 1)) {
                                System.out.print("*");
                            }
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}