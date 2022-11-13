package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_1945 {

    public static int[] targets = {2, 3, 5, 7, 11};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int testCase = 1; testCase <= T; testCase++) {
            sb.append("#" + testCase + " ");
            int N = Integer.parseInt(br.readLine());

            for (int target : targets) {
                int returnedExp = calculate(N, target, 0);
                sb.append(returnedExp + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public static int calculate(int N, int base, int exp) {

        if (N % ((int) Math.pow(base, exp)) != 0)
            return exp - 1;

        return calculate(N, base, exp + 1);
    }


}
