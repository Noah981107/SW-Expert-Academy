package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Solve_1928 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testCase = 1; testCase <= T; testCase++) {
            sb.append("#" + testCase + " ");
            byte[] decoded = Base64.getDecoder().decode(br.readLine());
            String result = new String(decoded, StandardCharsets.UTF_8);
            sb.append(result + "\n");
        }
        System.out.println(sb);
    }
}
