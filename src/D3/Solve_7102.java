package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solve_7102 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testCase=1; testCase<=T; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            Map<Integer, Integer> map = new HashMap<>();
            for (int i=1; i<=N; i++) {
                for (int j=1; j<=M; j++) {
                    map.put(i + j, map.getOrDefault(i + j, 0) + 1);
                }
            }

            List<Integer> arr = new ArrayList<>(map.keySet());
            Collections.sort(arr, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return map.get(o2) - map.get(o1);
                }
            });

            sb.append("#" + testCase + " ");
            sb.append(arr.get(0) + " ");
            for (int i=1; i<arr.size(); i++) {
                if (map.get(arr.get(i)) == map.get(arr.get(0)))
                    sb.append(arr.get(i) + " ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
