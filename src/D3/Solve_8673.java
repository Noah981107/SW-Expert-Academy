package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Solve_8673 {

    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testCase=1; testCase<=T; testCase++) {
            int K = Integer.parseInt(br.readLine());
            int N = (int) Math.pow(2, K);
            List<Integer> arr = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i=0; i<N; i++) {
                arr.add(Integer.parseInt(st.nextToken()));
            }
            result = 0;
            while (true) {
                arr = solution(arr);
                if (arr.size() == 1)
                    break;
            }
            sb.append("#" + testCase + " ").append(result).append("\n");
        }
        System.out.print(sb);
    }

    public static List<Integer> solution(List<Integer> arr) {
        List<Integer> answer = new ArrayList<>();
        for (int i=0; i<arr.size(); i += 2) {
            int a = arr.get(i);
            int b = arr.get(i + 1);
            result += Math.abs(a - b);
            answer.add(Math.max(a, b));
        }
        return answer;
    }
}
