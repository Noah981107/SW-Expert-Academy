package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_1288 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testCase = 1; testCase <= T; testCase++) {
            boolean[] visited = new boolean[10];
            int N = Integer.parseInt(br.readLine());
            int count = 0;
            int multiply = 1;
            String text = "";
            while (!isAlreadyCount(visited)) {
                count++;
                text = Integer.toString(N * multiply);
                for (int i = 0; i < text.length(); i++) {
                    visited[text.charAt(i) - '0'] = true;
                }
                multiply++;
            }
            sb.append("#" + testCase + " ").append(text).append("\n");
        }
        System.out.print(sb);
    }

    public static boolean isAlreadyCount(boolean[] visited) {
        for (boolean visit : visited) {
            if (!visit)
                return false;
        }
        return true;
    }
}
