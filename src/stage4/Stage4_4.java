package stage4;

import java.util.Scanner;

public class Stage4_4 {

    public static void main(String[] args) {
        /*
        문제 - 최대값
        9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.

        예를 들어, 서로 다른 9개의 자연수
        3, 29, 38, 12, 57, 74, 40, 85, 61
        이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.

        입력
        첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다.
        주어지는 자연수는 100 보다 작다.

        출력
        첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.

        예제 입력 1
        3
        29
        38
        12
        57
        74
        40
        85
        61

        예제 출력 1
        85
        8
        */
        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt(); //문제에 9개의 정수가 주어진다고 설정되어 있기 때문에 "입력받을 정수"라는 의미의 변수가 필요X
        int max = 0; //최대값 변수
        int location = 0; //최대값의 위치 변수
        int[] arr = new int[9];


        //9번 입력받기 위한 반복문
        for (int i = 0, a =0; i < arr.length; i++) {
            a = scanner.nextInt();
            if (a < 100) {
                arr[i] = a;
            } else {
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                location = i + 1;
                continue;
            }
        }
        System.out.println(max);
        System.out.println(location);
    }
}
