package D1;

import java.io.*;

class Solve_1936 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int num1 = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);

        if (num1 == 1) {
            if (num2 == 2)
                System.out.println("B");
            else
                System.out.println("A");

        } else if (num1 == 2) {
            if (num2 == 1)
                System.out.println("A");
            else
                System.out.println("B");
        } else {
            if (num2 == 1)
                System.out.println("B");
            else
                System.out.println("A");
        }
    }
}