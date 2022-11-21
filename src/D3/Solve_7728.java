package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Solve_7728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int t=1; t<=T; t++) {
            sb.append("#" + t + " ");
            String input = br.readLine();
            Set<Character> set = new HashSet<>();
            for (int i=0; i<input.length(); i++) {
                set.add(input.charAt(i));
            }
            sb.append(set.size() + "\n");
        }

        System.out.print(sb);
    }
}
