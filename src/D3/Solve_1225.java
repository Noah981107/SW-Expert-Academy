package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solve_1225 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while (true) {
            Integer testNum = Integer.parseInt(br.readLine());
            Queue<Integer> queue = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i=0; i<8; i++) {
                queue.add(Integer.parseInt(st.nextToken()));
            }

            int minusNum = 1;
            while(true) {
                if (minusNum > 5)
                    minusNum = 1;
                Integer target = queue.poll();
                Integer insertNum = target - minusNum;

                if (insertNum <= 0) {
                    queue.add(0);
                    break;
                }

                queue.add(target - minusNum);
                minusNum++;
            }

            sb.append("#" + testNum + " ");
            while (!queue.isEmpty()) {
                sb.append(queue.poll() + " ");
            }
            sb.append("\n");

            if (testNum == 10)
                break;
        }
        System.out.print(sb);
    }
}
