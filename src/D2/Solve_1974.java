package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_1974 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testCase = 1; testCase <= T; testCase++) {
            int[][] map = new int[9][9];
            sb.append("#" + testCase + " ");
            for (int i = 0; i < 9; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 9; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            boolean isEnd = false;
            for (int i = 0; i < 9; i++) {
                if (isEnd)
                    break;
                for (int j = 0; j < 9; j++) {
                    if (!checkRow(map, i, j) || !checkColumn(map, i, j) || !check3By3(map, i, j)) {
                        sb.append(0);
                        isEnd = true;
                        break;
                    }
                }
            }
            if (!isEnd)
                sb.append(1);

            sb.append("\n");
        }
        System.out.print(sb);
    }

    public static int convertStart(int index) {
        if (index < 3)
            return 0;
        else if (index >= 3 && index < 6)
            return 3;
        else
            return 6;
    }

    public static boolean check3By3(int[][] map, int row, int column) {
        int target = map[row][column];
        int newRow = convertStart(row);
        int newColumn = convertStart(column);
        for (int i = newRow; i < newRow + 3; i++) {
            for (int j = newColumn; j < newColumn + 3; j++) {
                if (i != row && j != column && target == map[i][j])
                    return false;
            }
        }
        return true;
    }

    public static boolean checkRow(int[][] map, int row, int targetIndex) {
        int target = map[row][targetIndex];
        for (int i = 0; i < 9; i++) {
            if (i != targetIndex && map[row][i] == target)
                return false;
        }
        return true;
    }

    public static boolean checkColumn(int[][] map, int row, int targetIndex) {
        int target = map[row][targetIndex];
        for (int i = 0; i < 9; i++) {
            if (i != row && map[i][targetIndex] == target)
                return false;
        }
        return true;
    }
}
