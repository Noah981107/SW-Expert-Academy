package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_3431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int testCase=1; testCase<=T; testCase++) {
            sb.append("#" + testCase + " ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int U = Integer.parseInt(st.nextToken());
            int X = Integer.parseInt(st.nextToken());

            if (X > U)
                sb.append(-1);
            else if (L <= X && X <=U)
                sb.append(0);
            else {
                sb.append(L - X);
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}
