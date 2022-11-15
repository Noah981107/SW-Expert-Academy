package D2;

import java.io.*;

class Solve_1986 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int testCase = 1; testCase <= T; testCase++) {
            int n = Integer.parseInt(br.readLine());
            int result = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0)
                    result -= i;
                else
                    result += i;
            }
            sb.append("#" + testCase + " " + result).append("\n");
        }
        System.out.print(sb);
    }
}