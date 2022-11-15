package D2;

import java.io.*;

class Solve_2007 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int testCase = 1; testCase <= T; testCase++) {
            String input = br.readLine();
            int result = -1;
            for (int step = 1; step <= 10; step++) {
                String node = input.substring(0, step);
                String nextNode = input.substring(step, step * 2);
                if (node.equals(nextNode)) {
                    result = step;
                    break;
                }
            }
            sb.append("#").append(testCase + " ").append(result).append("\n");
        }
        System.out.println(sb);
    }
}