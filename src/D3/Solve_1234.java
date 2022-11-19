package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve_1234 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int t=1; t<=10; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            String txt = st.nextToken();
            boolean isDone = false;
            while(!isDone) {
                boolean isFound = false;
                for (int i=0; i<txt.length() - 1; i++) {
                    if (txt.charAt(i) == txt.charAt(i+1)) {
                        isFound = true;
                        if (i != txt.length() - 2)
                            txt = txt.substring(0, i) + txt.substring(i+2);
                        else
                            txt = txt.substring(0, i);

                        break;
                    }
                }
                if (!isFound)
                    isDone = true;
            }
            sb.append("#" + t + " ").append(txt).append("\n");
        }
        System.out.print(sb);
    }
}
