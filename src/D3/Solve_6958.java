package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_6958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int testCase=1; testCase<=T; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int correctProblemMax = 0;
            int sameOnePrizeNum = 0;

            for (int i=0; i<N; i++) {
                st = new StringTokenizer(br.readLine());
                int count = 0;
                while (st.hasMoreTokens()) {
                    int now = Integer.parseInt(st.nextToken());
                    if (now == 1)
                        count++;
                }

                if (correctProblemMax < count) {
                    correctProblemMax = count;
                    sameOnePrizeNum = 1;
                }
                else if (correctProblemMax == count) {
                    sameOnePrizeNum++;
                }
            }

            sb.append("#" + testCase + " ").append(sameOnePrizeNum + " ").append(correctProblemMax + "\n");
        }
        System.out.print(sb);
    }
}
