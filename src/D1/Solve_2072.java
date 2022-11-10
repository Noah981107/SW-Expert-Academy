package D1;

import java.io.*;

class Solve_2072 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            String[] input = br.readLine().split(" ");
            int result = 0;
            for (String value : input) {
                if (Integer.parseInt(value) % 2 != 0)
                    result += Integer.parseInt(value);
            }
            System.out.println("#" + i + " " + result);
        }
    }
}