package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_9317 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int testCase=1; testCase<=T; testCase++) {
            int N = Integer.parseInt(br.readLine());
            String answer = br.readLine();
            String my = br.readLine();

            for (int i=0; i<answer.length(); i++) {
                if (answer.charAt(i) != my.charAt(i))
                    N--;
            }

            sb.append("#" + testCase + " ").append(N).append("\n");
        }
        System.out.print(sb);
    }
}
