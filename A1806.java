import java.util.Scanner;

public class A1806 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int ans = 0;
            if (b > d) {
                System.out.println(-1);
                continue;
            }

            ans += (d - b);
            a += (d - b);
            b = d;

            if (a < c) {
                System.out.println(-1);
                continue;
            }

            ans += (a - c);
            System.out.println(ans);
        }
        sc.close();
    }
}
