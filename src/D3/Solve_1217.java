package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_1217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        for (int testCase=1; testCase<=10; testCase++) {
            int num = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int result = calculate(N, M);

            sb.append("#" + testCase + " ").append(result + "\n");
        }
        System.out.println(sb);
    }
    public static int calculate(int N, int M) {
        if (M == 1)
            return N;

        return N * calculate(N, M - 1);
    }
}
