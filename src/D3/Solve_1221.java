package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solve_1221 {

    static Map<String, Integer> map = new HashMap<>();
    static Map<Integer, String> map2 = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        init();
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int t=1; t<=T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String test = st.nextToken();
            Integer num = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            List<Integer> inputConvert = new ArrayList<>();
            while (st.hasMoreTokens()) {
                inputConvert.add(map.get(st.nextToken()));
            }
            Collections.sort(inputConvert);
            sb.append("#" + t + "\n");
            for (Integer ele : inputConvert) {
                sb.append(map2.get(ele) + " ");
            }
        }
        System.out.print(sb);
    }
    public static void init() {
        map.put("ZRO", 0);
        map.put("ONE", 1);
        map.put("TWO", 2);
        map.put("THR", 3);
        map.put("FOR", 4);
        map.put("FIV", 5);
        map.put("SIX", 6);
        map.put("SVN", 7);
        map.put("EGT", 8);
        map.put("NIN", 9);

        map2.put(0, "ZRO");
        map2.put(1, "ONE");
        map2.put(2, "TWO");
        map2.put(3, "THR");
        map2.put(4, "FOR");
        map2.put(5, "FIV");
        map2.put(6, "SIX");
        map2.put(7, "SVN");
        map2.put(8, "EGT");
        map2.put(9, "NIN");
    }
}
