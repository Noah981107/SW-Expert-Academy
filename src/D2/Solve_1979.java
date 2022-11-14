package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_1979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testCase=1; testCase<=T; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int[][] map = new int[N][N];
            for (int i=0; i<N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j=0; j<N; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int widthResult = checkWidth(map, K);
            int heightResult = checkHeight(map, K);
            sb.append("#" + testCase + " ").append(widthResult + heightResult).append("\n");
        }
        System.out.print(sb);
    }

    public static int checkHeight(int[][] map, int K) {
        int result = 0;

        for (int i=0; i<map.length; i++) {
            int cnt = 0;
            for (int j=0; j<map.length; j++) {
                if (map[j][i] == 0) {
                    if (cnt == K) {
                        result++;
                    }
                    cnt = 0;
                }
                else
                    cnt++;
            }
            if (cnt == K)
                result++;
        }

        return result;
    }

    public static int checkWidth(int[][] map, int K) {

        int result = 0;

        for (int i=0; i<map.length; i++) {
            int cnt = 0;
            for (int j=0; j<map[i].length; j++) {
                if (map[i][j] == 0) {
                    if (cnt == K) {
                        result++;
                    }
                    cnt = 0;
                }
                else
                    cnt++;
            }
            if (cnt == K)
                result++;
        }

        return result;
    }
}
