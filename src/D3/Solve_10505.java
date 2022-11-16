package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_10505 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testCase=1; testCase<=T; testCase++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            for (int i=0; i<N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                sum += arr[i];
            }

            int average = sum / N;
            int count =0;
            for (int i=0; i<N; i++) {
                if (arr[i] <= average)
                    count++;
            }

            sb.append("#" + testCase + " ").append(count).append("\n");
        }

        System.out.print(sb);
    }
}
