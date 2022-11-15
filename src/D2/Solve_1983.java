package D2;

import java.util.Scanner;

public class Solve_1983 {

    static String grade[]= {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for (int tc = 1; tc <=t; tc++) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            double [] score=new double[n];
            for (int i = 0; i < n; i++) {
                int mid=sc.nextInt();
                int fin=sc.nextInt();
                int project=sc.nextInt();
                score[i]=mid*0.35+fin*0.45+project*0.2;

            }
            int rank=0;
            for (int i = 0; i < n; i++) {
                if(score[i]>score[k-1])rank+=1;
            }
            System.out.printf("#%d %s\n",tc,grade[rank/(n/10)]);

        }
        sc.close();
    }


}