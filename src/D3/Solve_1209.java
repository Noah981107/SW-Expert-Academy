package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_1209 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        for (int testCase=1; testCase<=10; testCase++) {
            int n = Integer.parseInt(br.readLine());
            int[][] map = new int[100][100];
            for (int i=0; i<100; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j=0; j<100; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int result = Integer.MIN_VALUE;
            result = Math.max(result, getMaxWidth(map));
            result = Math.max(result, getMaxHeight(map));
            result = Math.max(result, getLeftDiagonal(map));
            result = Math.max(result, getRightDiagonal(map));
            sb.append("#" + testCase + " ").append(result + "\n");
        }
        System.out.print(sb);
    }

    public static int getRightDiagonal(int[][] map) {
        int sum = 0;
        for (int i=0; i<100; i++) {
            sum += map[i][99-i];
        }
        return sum;
    }

    public static int getLeftDiagonal(int[][] map) {
        int sum = 0;
        for (int i=0; i<100; i++) {
            sum += map[i][i];
        }
        return sum;
    }

    public static int getMaxWidth(int[][] map) {

        int max = Integer.MIN_VALUE;

        for (int i=0; i<100; i++) {
            int sum = 0;
            for (int j=0; j<100; j++) {
                sum += map[i][j];
            }
            max = Math.max(max, sum);
        }

        return max;
    }

    public static int getMaxHeight(int[][] map) {
        int max = Integer.MIN_VALUE;
        for (int j=0; j<100; j++) {
            int sum = 0;
            for (int i=0; i<100; i++) {
                sum += map[i][j];
            }
            max = Math.max(max, sum);
        }

        return max;
    }
}
