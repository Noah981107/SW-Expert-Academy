package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_1948 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int testCase = 1; testCase <= T; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int dayCount = 0;
            int month1 = Integer.parseInt(st.nextToken());
            int day1 = Integer.parseInt(st.nextToken());
            int month2 = Integer.parseInt(st.nextToken());
            int day2 = Integer.parseInt(st.nextToken());
            for (int i = month1; i <= month2; i++) {
                if (i == 2)
                    dayCount += 28;
                else if (i == 4 || i == 6 || i == 9 || i == 11)
                    dayCount += 30;
                else
                    dayCount += 31;
            }
            int tmp1 = month1Calculate(day1);
            int tmp2 = moth2Calculate(month2, day2);
            dayCount -= tmp1;
            dayCount -= tmp2;
            dayCount++;
            sb.append("#" + testCase + " ").append(dayCount).append("\n");
        }

        System.out.print(sb);
    }

    public static int month1Calculate(int day) {
        return day;
    }

    public static int moth2Calculate(int month, int day) {
        int maxDay = 31;
        if (month == 2)
            maxDay = 28;
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            maxDay = 30;

        return maxDay - day;
    }


}
