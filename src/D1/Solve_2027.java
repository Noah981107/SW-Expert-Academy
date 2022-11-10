package D1;

class Solve_2027 {
    public static void main(String args[]) throws Exception {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == j)
                    sb.append("#");
                else
                    sb.append("+");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}