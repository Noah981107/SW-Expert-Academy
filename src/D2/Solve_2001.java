package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_2001 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int testCase=1; testCase<=T; testCase++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[][] map = new int[N][N];
            for (int i=0; i<N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j=0; j<N; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int result = search(map, M);
            sb.append("#" + testCase + " ").append(result).append("\n");
        }

        System.out.println(sb);
    }

    public static int search(int[][] map, int M) {

        int result = Integer.MIN_VALUE;

        for (int i=0; i<map.length - M + 1; i++) {
            for (int j=0; j<map[i].length - M + 1; j++) {

                int sum = 0;
                for (int x=i; x<i+M; x++) {
                    for (int y=j; y<j + M; y++) {
                        sum += map[x][y];
                    }
                }

                result = Math.max(result, sum);
            }
        }

        return result;
    }
}
