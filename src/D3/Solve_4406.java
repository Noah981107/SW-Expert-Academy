package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_4406 {

    public static String targets = "aeiou";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int testCase=1; testCase<=T; testCase++) {
            sb.append("#" + testCase + " ");
            char[] input = br.readLine().toCharArray();
            String result = "";
            for (int i=0; i<input.length; i++) {
                if (!targets.contains(Character.toString(input[i])))
                    result += input[i];
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
