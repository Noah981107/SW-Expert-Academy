package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve_1215 {

    static char[][] map;
    static int N;
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int testCase=1; testCase<=10; testCase++) {
            N = Integer.parseInt(br.readLine());
            map = new char[8][8];
            for (int i=0; i<8; i++) {
                String input = br.readLine();
                for (int j=0; j<8; j++) {
                    map[i][j] = input.charAt(j);
                }
            }
            result = 0;
            findWidth();
            findHeight();
            sb.append("#" + testCase + " ").append(result).append("\n");
        }
        System.out.print(sb);
    }

    public static boolean isCircular(String input) {
        String tmp = "";
        for (int i=input.length() - 1; i>=0; i--) {
            tmp += input.charAt(i);
        }
        if (input.equals(tmp)) {
            return true;
        }

        return false;
    }

    public static void findWidth() {
        for (int i=0; i<8; i++) {
            for (int j=0; j<=8-N; j++) {
                String tmp = "";
                for (int k=j; k<j+N; k++) {
                    tmp += map[i][k];
                }
                if (isCircular(tmp))
                    result++;
            }
        }
    }

    public static void findHeight() {
        for (int i=0; i<=8-N; i++) {
            for (int j=0; j<8; j++) {
                String tmp = "";
                for (int k=i; k<i+N; k++) {
                    tmp += map[k][j];
                }
                if (isCircular(tmp))
                    result++;
            }
        }
    }

}
