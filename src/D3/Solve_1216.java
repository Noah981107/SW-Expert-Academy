package D3;

import java.util.Scanner;

class Solve_1216 {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);

        for (int T = 1; T <= 10; T++) {

            int[][] map = new int[100][100];
            int patternLen = 0;

            // [input] Test 번호
            int TestNo = Integer.parseInt(sc.nextLine());

            // [input] 데이터 입력
            for (int i = 0; i < 100; i++) {
                String line = sc.nextLine();
                for (int j = 0; j < 100; j++) {
                    map[i][j] = line.charAt(j) - 'A';
                }
            }

            // 단순 반복 (length 100부터 1까지)
            for (int l = 100; l > 0; l--) {
                boolean isFound = findPattern(map, l);
                if (isFound) {
                    patternLen = l;
                    break;
                }
            }

            System.out.println(String.format("#%d %d", T, patternLen));
        }

    }

    public static boolean findPattern(int[][] map, int length) {
        // 1.열 기준 검색
        for (int k = 0; k < 100; k++) {
            for (int m = 0; m < 100 - length + 1; m++) {
                // 명확하게 시작점과 끝점을 재정의하자!
                int startIndex = m;
                int endIndex = m + length - 1;

                // 회문 체크 (행기준)
                for (int l = 0; l < length / 2; l++) {
                    if (map[k][startIndex + l] != map[k][endIndex - l]) {
                        break;
                    }
                    if (l == length / 2 - 1) {
                        return true;
                    }
                }

                for (int l = 0; l < length / 2; l++) {
                    if (map[startIndex + l][k] != map[endIndex - l][k]) {
                        break;
                    }
                    if (l == length / 2 - 1) {
                        return true;
                    }
                }

            }
        }
        return false;
    }
}