package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_1959 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int testCase = 1; testCase <= T; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[] arr1 = new int[N];
            int[] arr2 = new int[M];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++)
                arr1[i] = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++)
                arr2[i] = Integer.parseInt(st.nextToken());

            int result;
            if (N > M)
                result = calculate(arr2, arr1);
            else
                result = calculate(arr1, arr2);

            sb.append("#" + testCase + " ").append(result).append("\n");
        }

        System.out.print(sb);
    }

    public static int calculate(int[] smallSize, int[] bigSize) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= bigSize.length - smallSize.length; i++) {
            int sum = 0;
            for (int j = 0; j < smallSize.length; j++)
                sum += (smallSize[j] * bigSize[i + j]);
            max = Math.max(max, sum);
        }
        return max;
    }

}
