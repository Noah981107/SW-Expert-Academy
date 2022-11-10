package D1;

import java.io.*;

class Solve_2019 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            int tmp = (int) Math.pow(2, i);
            sb.append(tmp).append(" ");
        }
        System.out.println(sb);
    }
}