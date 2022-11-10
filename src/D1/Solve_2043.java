package D1;

import java.io.*;

class Solve_2043 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int p = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        System.out.println((p - k + 1));
    }
}