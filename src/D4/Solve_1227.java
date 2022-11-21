package D4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solve_1227 {

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
        for (int testCase = 1; testCase <= 10; testCase++) {
            int testNum = Integer.parseInt(br.readLine());
            map = new int[100][100];
            visited = new boolean[100][100];
            int startX = 0;
            int startY = 0;
            int endX = 0;
            int endY = 0;
            for (int i = 0; i < 100; i++) {
                String line = br.readLine();
                for (int j = 0; j < 100; j++) {
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
            bfs(startX, startY);
            if (visited[endY][endX])
                sb.append(1);
            else
                sb.append(0);
            sb.append("\n");
        }
        System.out.print(sb);
    }

    public static void bfs(int x, int y) {
        Queue<Location> queue = new LinkedList<>();
        visited[y][x] = true;
        queue.add(new Location(x, y));
        while (!queue.isEmpty()) {
            Location location = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nX = location.x + dx[i];
                int nY = location.y + dy[i];

                if (nX < 0 || nX >= 100 || nY < 0 || nY >= 100)
                    continue;

                if (!visited[nY][nX] && map[nY][nX] != 1) {
                    visited[nY][nX] = true;
                    queue.add(new Location(nX, nY));
                }
            }
        }
    }
}
