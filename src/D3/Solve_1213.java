package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        for (int testCase=1; testCase<=10; testCase++) {
            int n = Integer.parseInt(br.readLine());
            String target = br.readLine();
            String txt = br.readLine();

            int len = target.length();
            int cnt = 0;
            for (int i=0; i<txt.length() - len + 1; i++) {
                if (txt.substring(i, i + len).equals(target))
                    cnt++;
            }
            sb.append("#" + testCase + " ");
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}
