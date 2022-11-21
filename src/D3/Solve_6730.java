package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_6730 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int testCase=1; testCase<=T; testCase++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i=0; i<n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int up = 0;
            int down = 0;
            for (int i=0; i<n - 1; i++) {
                if (arr[i] < arr[i + 1])
                    up = Math.max(up, arr[i + 1] - arr[i]);
                else if (arr[i] > arr[i + 1])
                    down = Math.max(down, arr[i] - arr[i + 1]);
            }

            sb.append("#" + testCase + " ");
            sb.append(up + " " + down).append("\n");
        }
        System.out.print(sb);
    }
}
