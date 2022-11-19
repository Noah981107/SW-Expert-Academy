package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_5601 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testCase=1; testCase<=T; testCase++) {
            sb.append("#" + testCase + " ");
            int N = Integer.parseInt(br.readLine());
            for (int i=0; i<N; i++) {
                sb.append("1/" + N + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
