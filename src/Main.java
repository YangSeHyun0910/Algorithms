import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        //BufferedReader 을 통해 입력받은 값을 개행문자 단위(Line 단위)로 나누어진다. => readLine();
        //리턴값이 String 으로 고정 되기 때문에 형변환 필요. => Integer.parseInt();
        int count = Integer.parseInt(bufferedReader.readLine());

        int[] sum = new int[count];

        if (count > 0 && count <= 1000000) {
            for (int i = 0; i < count; i++) {
                st = new StringTokenizer(bufferedReader.readLine());
                bufferedWriter.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
            }
        }
        bufferedWriter.close();
    }
}