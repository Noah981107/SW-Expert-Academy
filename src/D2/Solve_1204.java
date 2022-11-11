package D2;

import java.io.*;
import java.util.*;

class Solve_1204 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int testCase = 1; testCase <= T; testCase++) {
            int n = Integer.parseInt(br.readLine());
            Map<Integer, Integer> map = new HashMap<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                int now = Integer.parseInt(st.nextToken());
                map.put(now, map.getOrDefault(now, 0) + 1);
            }
            List<Integer> tmp = new ArrayList<>(map.keySet());
            Collections.sort(tmp, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    if (map.get(o2) == map.get(o1))
                        return o2 - o1;

                    return map.get(o2) - map.get(o1);
                }
            });
            sb.append("#" + testCase + " ").append(tmp.get(0)).append("\n");
        }
        System.out.print(sb);
    }
}