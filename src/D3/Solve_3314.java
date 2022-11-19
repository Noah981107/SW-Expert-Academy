package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_3314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testCase=1; testCase<=T; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            int count = 0;
            while (st.hasMoreTokens()) {
                Integer now = Integer.parseInt(st.nextToken());
                if (now < 40)
                    now = 40;

                sum += now;
                count++;
            }
            sb.append("#" + testCase + " ").append(sum / count).append("\n");
        }
        System.out.print(sb);
    }
}
