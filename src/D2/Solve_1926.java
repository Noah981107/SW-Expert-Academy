package D2;

import java.io.*;

class Solve_1926 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            String tmp = Integer.toString(i);
            int count = 0;
            for (int j = 0; j < tmp.length(); j++) {
                if (tmp.charAt(j) == '3' || tmp.charAt(j) == '6' || tmp.charAt(j) == '9')
                    count++;
            }
            if (count == 0)
                sb.append(i).append(" ");
            else {
                for (int k = 0; k < count; k++) {
                    sb.append("-");
                }
                sb.append(" ");
            }
        }

        System.out.println(sb);
    }
}