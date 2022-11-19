package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Solve_13229 {

    static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        init();
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testCase=1; testCase<=T; testCase++) {
            sb.append("#" + testCase + " ");
            String day = br.readLine();
            sb.append(7 - map.get(day) + "\n");
        }
        System.out.print(sb);
    }

    public static void init() {
        map.put("SUN", 0);
        map.put("MON", 1);
        map.put("TUE", 2);
        map.put("WED", 3);
        map.put("THU", 4);
        map.put("FRI", 5);
        map.put("SAT", 6);
    }
}
