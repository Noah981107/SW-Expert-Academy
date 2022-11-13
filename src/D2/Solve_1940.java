package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_1940 {

    static class Car {
        int speed;
        int distance;

        public Car() {
            this.speed = 0;
            this.distance = 0;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testCase = 1; testCase <= T; testCase++) {
            int n = Integer.parseInt(br.readLine());

            Car car = new Car();
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int command = Integer.parseInt(st.nextToken());
                if (command != 0) {
                    int speed = Integer.parseInt(st.nextToken());
                    if (command == 1) {
                        car.speed += speed;
                    } else {
                        car.speed -= speed;
                        if (car.speed < 0)
                            car.speed = 0;
                    }
                }

                car.distance += (1 * car.speed);
            }
            sb.append("#" + testCase + " " + car.distance).append("\n");
        }
        System.out.print(sb);
    }
}
