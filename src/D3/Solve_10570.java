package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Solve_10570 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testCase=1; testCase<=T; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cnt = 0;
            for (int i=start; i<=end; i++) {
                if (isSquared(i)) {
                    if (isCircular(Integer.toString(i)) && isCircular(Integer.toString((int) Math.sqrt(i))))
                        cnt++;
                }
            }
            sb.append("#" + testCase + " ").append(cnt).append("\n");
        }
        System.out.print(sb);
    }

    public static boolean isCircular(String number) {
        String reverseNumber = "";
        for (int i=number.length()-1; i>=0; i--) {
            reverseNumber += number.charAt(i);
        }

        if (number.equals(reverseNumber))
            return true;

        return false;
    }

    public static boolean isSquared(int number) {
        int tmp = (int) Math.pow((int) Math.sqrt(number), 2);

        if (tmp == number)
            return true;

        return false;
    }
}
