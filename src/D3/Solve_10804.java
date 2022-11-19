package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solve_10804 {

    static Map<Character, Character> map = new HashMap<>();

    public static void init() {
        map.put('q', 'p');
        map.put('p', 'q');
        map.put('d', 'b');
        map.put('b', 'd');
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        init();
        StringBuilder sb = new StringBuilder();
        for(int testCase=1; testCase<=T; testCase++) {
            sb.append("#" + testCase + " ");
            String input = br.readLine();

            String result = "";
            for (int i=input.length() - 1; i>=0; i--) {
                result += (map.get(input.charAt(i)));
            }
            sb.append(result + "\n");
        }
        System.out.print(sb);
    }
}
