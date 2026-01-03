import java.util.Scanner;

public class B1624 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            boolean ok = false;

            long newA = 2 * (long) b - c;
            if (newA > 0 && newA % a == 0)
                ok = true;

            if (((long) a + c) % 2 == 0) {
                long newB = (a + c) / 2;
                if (newB > 0 && newB % b == 0)
                    ok = true;
            }

            long newC = 2 * (long) b - a;
            if (newC > 0 && newC % c == 0)
                ok = true;

            System.out.println(ok ? "YES" : "NO");
        }
        sc.close();
    }
}