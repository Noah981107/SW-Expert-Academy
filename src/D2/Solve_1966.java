package D2;

import java.util.*;
import java.io.*;

class Solve_1966 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int test_case = 1; test_case <= T; test_case++) {
            int n = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            List<Integer> arr = new LinkedList<>();

            for (int i = 0; i < n; i++) {
                arr.add(Integer.parseInt(input[i]));
            }

            Collections.sort(arr);
            sb.append("#" + test_case + " ");
            for (Integer value : arr) {
                sb.append(value).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }
}