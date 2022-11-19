package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_1289 {

    static char[] before, now;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int testCase=1; testCase<=T; testCase++) {
            before = br.readLine().toCharArray();
            now = new char[before.length];
            count = 0;
            for (int i=0; i<before.length; i++)
                now[i] = '0';

            convert();
            sb.append("#" + testCase + " ").append(count).append("\n");
        }
        System.out.println(sb);
    }

    public static void convert() {

        int i=0;
        while (i < before.length) {
            if (before[i] != now[i]) {
                for (int j=i; j < before.length; j++) {
                    now[j] = before[i];
                }
                count++;
            }
            if (before.equals(now))
                return;
            i++;
        }
    }
}
