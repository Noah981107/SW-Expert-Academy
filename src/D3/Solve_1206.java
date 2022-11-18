package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solve_1206 {

    static int[] buildings;
    static int N, result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int t = 1; t <= 10; t++) {
            N = Integer.parseInt(br.readLine());
            buildings = new int[N + 4];
            StringTokenizer st = new StringTokenizer(br.readLine());
            init(N);
            for (int i = 2; i < N+2; i++) {
                buildings[i] = Integer.parseInt(st.nextToken());
            }
            result = 0;
            find();
            sb.append("#" + t + " ").append(result).append("\n");
        }
        System.out.print(sb);
    }

    public static void find() {
        for (int i=2; i<N+2; i++) {
            int maxLeft = Math.max(buildings[i -2], buildings[i-1]);
            int maxRight = Math.max(buildings[i + 1], buildings[i + 2]);

            if ((buildings[i] > maxLeft) && (buildings[i] > maxRight)) {
                result += buildings[i] - Math.max(maxLeft, maxRight);
            }
        }
    }

    public static void init(int N) {
        buildings[0] = 0;
        buildings[1] = 0;
        buildings[N + 2] = 0;
        buildings[N + 3] = 0;
    }
}
