package D2;

import java.io.*;

class Solve_1989 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int testCase = 1; testCase <= T; testCase++) {
            sb.append("#" + testCase + " ");
            String input = br.readLine();
            StringBuffer tmp = new StringBuffer(input);
            String reverse = tmp.reverse().toString();
            if (input.equals(reverse))
                sb.append(1);
            else
                sb.append(0);

            sb.append("\n");
        }
        System.out.print(sb);
    }

}