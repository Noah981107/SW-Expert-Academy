package D4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solve_1226 {

    static class Location {
        int x;
        int y;

        Location(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        for (int testCase=1; testCase<=10; testCase++) {
            int testNum = Integer.parseInt(br.readLine());
            map = new int[16][16];
            visited = new boolean[16][16];
            int startX = 0;
            int startY = 0;
            int endX = 0;
            int endY = 0;
            for (int i=0; i<16; i++) {
                String line = br.readLine();
                for (int j=0; j<16; j++) {
                    map[i][j] = line.charAt(j) - '0';

                    if (map[i][j] == 2) {
                        startX = j;
                        startY = i;
                    }

                    if (map[i][j] == 3) {
                        endX = j;
                        endY = i;
                    }
                }
            }
            sb.append("#" + testCase + " ");
            dfs(new Location(startX, startY));
            if (visited[endY][endX])
                sb.append(1);
            else
                sb.append(0);
            sb.append("\n");
        }
        System.out.print(sb);
    }

    public static void dfs(Location location) {
        for (int i=0; i<4; i++) {
            int nX = location.x + dx[i];
            int nY = location.y + dy[i];

            if (nX < 0 || nX >= 16 || nY < 0 || nY >= 16)
                continue;

            if (!visited[nX][nY] && map[nX][nY] != 1) {
                visited[nX][nY] = true;
                dfs(new Location(nX, nY));
            }
        }
    }
}
