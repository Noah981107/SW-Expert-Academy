package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_1970 {

    public static int[] moneys = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int testCase = 1; testCase <= T; testCase++) {
            int inputMoney = Integer.parseInt(br.readLine());
            sb.append("#" + testCase + "\n");
            for (int money : moneys) {
                int cnt = 0;
                if (money <= inputMoney) {
                    cnt = inputMoney / money;
                    inputMoney -= (cnt * money);
                }
                sb.append(cnt + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
