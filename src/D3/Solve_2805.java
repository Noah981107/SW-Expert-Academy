package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solve_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int testCase=1; testCase<=T; testCase++) {
            int N = Integer.parseInt(br.readLine());
            int[][] map = new int[N][N];

            for (int i=0; i<N; i++) {
                String input = br.readLine();
                for (int j=0; j<N; j++) {
                    map[i][j] = input.charAt(j) - '0';
                }
            }

            int mid = N / 2;
            int sum = 0;
            for (int i=0; i<=mid; i++) {
                for (int j=mid - i; j<=mid + i; j++) {
                    sum += map[i][j];
                }
            }

            for (int i=mid-1; i>=0; i--) {
                for (int j=mid-i; j<=mid+i; j++) {
                    sum += map[N - i - 1][j];
                }
            }

            sb.append("#" + testCase + " ").append(sum).append("\n");
        }
        System.out.print(sb);
    }
}
