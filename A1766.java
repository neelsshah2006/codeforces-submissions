import java.util.Scanner;

public class A1766 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int near, d, ans;
            if (n > 9) {
                near = (n / 10) * 10;
                d = (int) Math.log10(n);
                ans = (9 * d) + ((near / (int) Math.pow(10, d)));
            } else {
                ans = n;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
