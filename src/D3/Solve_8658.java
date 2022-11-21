package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_8658 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int t=1; t<=T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            while (st.hasMoreTokens()) {
                String now = st.nextToken();
                int sum = 0;
                for (int i=0; i<now.length(); i++) {
                    sum += now.charAt(i) - '0';
                }
                min = Math.min(min, sum);
                max = Math.max(max, sum);
            }
            sb.append("#" + t + " ").append(max + " " + min + "\n");
        }
        System.out.print(sb);
    }
}
