package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_9997 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testCase=1; testCase<=T; testCase++) {
            int n = Integer.parseInt(br.readLine());
            int hour = 0;
            int minute = 0;
            n *= 2;
            hour = n / 60;
            minute = n - (60 * hour);
            sb.append("#" + testCase + " ").append(hour + " " + minute).append("\n");
        }
        System.out.print(sb);
    }
}
