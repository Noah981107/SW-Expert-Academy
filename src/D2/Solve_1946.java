package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_1946 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int testCase = 1; testCase <= T; testCase++) {
            int N = Integer.parseInt(br.readLine());
            sb.append("#" + testCase + "\n");

            int count = 0;
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String alphabet = st.nextToken();
                int num = Integer.parseInt(st.nextToken());

                for (int j = 0; j < num; j++) {
                    if (count == 10) {
                        sb.append("\n");
                        sb.append(alphabet);
                        count = 1;
                    } else {
                        sb.append(alphabet);
                        count++;
                    }

                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
