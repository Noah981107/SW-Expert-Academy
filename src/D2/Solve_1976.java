package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_1976 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int testCase = 1; testCase <= T; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int hour1 = Integer.parseInt(st.nextToken());
            int minute1 = Integer.parseInt(st.nextToken());
            int hour2 = Integer.parseInt(st.nextToken());
            int minute2 = Integer.parseInt(st.nextToken());

            int minuteResult = 0;
            int hourResult = 0;
            if (minute1 + minute2 > 59) {
                hourResult += ((minute1 + minute2) / 60);
                minuteResult += ((minute1 + minute2) % 60);
            } else
                minuteResult = (minute1 + minute2);

            hourResult += (hour1 + hour2);
            if (hourResult > 12)
                hourResult -= 12;

            sb.append("#" + testCase + " ").append(hourResult + " ").append(minuteResult).append("\n");
        }
        System.out.println(sb);
    }
}
