package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_5431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int testCase=1; testCase<=T; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int[] students = new int[N + 1];
            st = new StringTokenizer(br.readLine());
            for (int i=0; i<K; i++) {
                students[Integer.parseInt(st.nextToken())] = 1;
            }
            sb.append("#" + testCase + " ");
            for (int i=1; i<students.length; i++) {
                if (students[i] == 0)
                    sb.append(i + " ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
