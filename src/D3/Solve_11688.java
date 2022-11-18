package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_11688 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testCase=1; testCase<=T; testCase++) {
            String input = br.readLine();
            int a = 1;
            int b = 1;
            for (int i=0; i<input.length(); i++) {
                char command = input.charAt(i);
                if (command == 'L')
                    b = a + b;
                else
                    a = a + b;
            }
            sb.append("#" + testCase + " ").append(a + " " + b).append("\n");
        }
        System.out.print(sb);
    }
}
