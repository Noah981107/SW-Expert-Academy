package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_8741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testCase=1; testCase<=T; testCase++) {
            sb.append("#" + testCase + " ");
            String input = br.readLine();
            input = input.toUpperCase();
            StringTokenizer st = new StringTokenizer(input);
            String result = "";
            while (st.hasMoreTokens()) {
                result += st.nextToken().charAt(0);
            }
            sb.append(result + " \n");
        }
        System.out.print(sb);
    }
}
