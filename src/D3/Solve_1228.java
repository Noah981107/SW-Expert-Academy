package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solve_1228 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int testCase=1; testCase<=10; testCase++) {
            int N = Integer.parseInt(br.readLine());
            List<Integer> arr = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i=0; i<N; i++) {
                arr.add(Integer.parseInt(st.nextToken()));
            }
            int commandNum = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                String command = st.nextToken();
                Integer x = Integer.parseInt(st.nextToken());
                Integer num = Integer.parseInt(st.nextToken());
                for (int i=0; i<num; i++) {
                    arr.add(x, Integer.parseInt(st.nextToken()));
                    x++;
                }
            }
            String result = "";
            for (int i=0; i<10; i++) {
                result += (arr.get(i) + " ");
            }
            sb.append("#" + testCase + " ");
            sb.append(result + "\n");
        }
        System.out.print(sb);
    }
}
