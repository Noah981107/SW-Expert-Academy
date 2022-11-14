package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_1961 {

    static int[][] arr90, arr180, arr270;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testCase = 1; testCase <= T; testCase++) {
            sb.append("#" + testCase + "\n");
            int n = Integer.parseInt(br.readLine());
            int[][] map = new int[n][n];
            arr90 = new int[n][n];
            arr180 = new int[n][n];
            arr270 = new int[n][n];
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            rotate(map, arr90);
            rotate(arr90, arr180);
            rotate(arr180, arr270);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    sb.append(arr90[i][j]);
                }
                sb.append(" ");
                for (int j = 0; j < n; j++) {
                    sb.append(arr180[i][j]);
                }
                sb.append(" ");
                for (int j = 0; j < n; j++) {
                    sb.append(arr270[i][j]);
                }
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }

    public static void rotate(int[][] target, int[][] result) {
        for (int i = 0; i < target.length; i++) {
            for (int j = 0; j < target.length; j++) {
                result[j][target.length - i - 1] = target[i][j];
            }
        }
    }
}
