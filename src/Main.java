import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];
        int[] count = new int[6];

        //각각의 체스말의 갯수를 입력받기 위해 6번 반복 실행
        for (int i = 0, a = 0; i < 6; i++) {
            a = scanner.nextInt();
            if (a >= 0 && a <= 10) {
                arr[i] = a;
                count[i] = 0;
            } else {
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 10; j++) {
                if (i <= 1) {
                    if (arr[i] == 1 || count[i] == 1) {
                        break;
                    } else if (arr[i] >= 2 && arr[i] <= 10) {
                        count[i] = count[i] - 1;
                        arr[i] = arr[i] - 1;
                        continue;
                    } else if (arr[i] <= 0) {
                        count[i] = count[i] + 1;
                        arr[i] = arr[i] + 1;
                        continue;
                    }
                } else if (i >= 2 && i <= 4) {
                    if (arr[i] == 2 || count[i] == 2) {
                        break;
                    } else if (arr[i] >= 3 && arr[i] <= 10) {
                        count[i] = count[i] - 1;
                        arr[i] = arr[i] - 1;
                        continue;
                    } else if (arr[i] < 2) {
                        count[i] = count[i] + 1;
                        arr[i] = arr[i] + 1;
                        continue;
                    }
                } else {
                    if (arr[i] == 8 || count[i] == 8) {
                        break;
                    } else if (arr[i] >= 9 && arr[i] <= 10) {
                        count[i] = count[i] - 1;
                        arr[i] = arr[i] - 1;
                        continue;
                    } else if (arr[i] < 8) {
                        count[i] = count[i] + 1;
                        arr[i] = arr[i] + 1;
                        continue;
                    }
                }
            }
        }

        for (int i = 0; i < count.length; i++) {
            System.out.print(count[i] + " ");
        }
    }
}