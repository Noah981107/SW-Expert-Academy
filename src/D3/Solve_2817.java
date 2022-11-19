package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_2817 {

    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testCase=1; testCase<=T; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[] arr = new int[N];

            st = new StringTokenizer(br.readLine());
            for (int i=0; i<N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            result = 0;

            solve(0, 0, K, N, arr);
            sb.append("#" + testCase + " ").append(result).append("\n");
        }
        System.out.print(sb);
    }

    public static void solve(int idx, int sum, int K, int N, int[] arr) {
        if (sum == K) {
            result++;
            return;
        }
        else if (sum > K || idx >= N)
            return;

        solve(idx + 1, sum + arr[idx], K, N, arr);
        solve(idx + 1, sum, K, N, arr);
    }
}
