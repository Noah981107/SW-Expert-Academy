package D1;

import java.io.*;

public class Solve_2071 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {

            String[] input = br.readLine().split(" ");
            double sum = 0;
            for (String value : input) {
                sum += Integer.parseInt(value);
            }
            sum = Math.round(sum / 10);

            System.out.println("#" + i + " " + (int) sum);
        }

    }
}
