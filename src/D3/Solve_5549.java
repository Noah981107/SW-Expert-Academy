package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_5549 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testCase=1; testCase<=T; testCase++) {
            sb.append("#" + testCase + " ");
            String input = br.readLine();
            if ((input.charAt(input.length() - 1) - '0') % 2 == 0)
                sb.append("Even");
            else
                sb.append("Odd");

            sb.append("\n");
        }
        System.out.print(sb);
    }
}
