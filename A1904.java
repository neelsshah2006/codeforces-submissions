import java.util.HashSet;
import java.util.Scanner;

public class A1904 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextInt();
            long b = sc.nextInt();

            long xk = sc.nextInt();
            long yk = sc.nextInt();
            long xq = sc.nextInt();
            long yq = sc.nextInt();

            long[] dx = { a, a, -a, -a, b, b, -b, -b };
            long[] dy = { b, -b, b, -b, a, -a, a, -a };

            HashSet<String> king_set = new HashSet<>();
            for (int i = 0; i < 8; i++) {
                king_set.add((xk + dx[i]) + "," + (yk + dy[i]));
            }

            HashSet<String> queen_set = new HashSet<>();
            for (int i = 0; i < 8; i++) {
                queen_set.add((xq + dx[i]) + "," + (yq + dy[i]));
            }

            int ans = 0;
            for (String x : king_set) {
                if (queen_set.contains(x))
                    ans++;
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
