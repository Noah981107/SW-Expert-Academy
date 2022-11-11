package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_1285 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testCase = 1; testCase <= T; testCase++) {
            int n = Integer.parseInt(br.readLine());

            int min = 100000;
            int minNum = 1;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i=0; i<n; i++) {
                int distance = Math.abs(Integer.parseInt(st.nextToken()));
                if (distance < min) {
                    min = distance;
                    minNum = 1;
                }
                else if (distance == min)
                    minNum++;
            }

            sb.append("#" + testCase + " ").append(min + " ").append(minNum);
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
