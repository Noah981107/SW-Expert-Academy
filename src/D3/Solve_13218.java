package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_13218 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int testCase=1; testCase<=T; testCase++) {
            int n = Integer.parseInt(br.readLine());

            sb.append("#" + testCase + " ");
            sb.append(n / 3).append("\n");
        }
        System.out.print(sb);
    }
}
