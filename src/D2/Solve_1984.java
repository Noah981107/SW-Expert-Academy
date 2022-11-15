package D2;

import java.io.*;

class Solve_1984 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            String[] input = br.readLine().split(" ");
            int[] arr = new int[input.length];

            int maxNum = Integer.MIN_VALUE;
            int minNum = Integer.MAX_VALUE;
            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(input[j]);
                minNum = Math.min(minNum, arr[j]);
                maxNum = Math.max(maxNum, arr[j]);
            }

            double result = 0;
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != minNum && arr[j] != maxNum) {
                    result += arr[j];
                    count++;
                }
            }
            long answer = Math.round(result / count);
            sb.append("#" + i + " ").append(answer).append("\n");
        }
        System.out.println(sb);
    }
}