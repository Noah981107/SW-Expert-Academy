package D2;

import java.io.*;
import java.util.*;

class Solve_1284 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int testCase = 1; testCase <= T; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            int Q = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());

            int costA = getCostFromA(P, W);
            int costB = getCostFromB(Q, R, S, W);
            sb.append("#" + testCase + " ");
            if (costA < costB)
                sb.append(costA);
            else
                sb.append(costB);

            sb.append("\n");
        }
        System.out.print(sb);
    }

    public static int getCostFromB(int underStandardCost, int standard, int overStandardCost, int use) {
        if (use <= standard)
            return underStandardCost;
        else
            return underStandardCost + (overStandardCost * (use - standard));

    }

    public static int getCostFromA(int usePerCost, int use) {
        return use * usePerCost;
    }
}