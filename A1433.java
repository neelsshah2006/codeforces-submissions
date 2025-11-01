import java.util.Scanner;

public class A1433 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int a = 0; a < t; a++) {
            int x = sc.nextInt();
            int ans = 0;
            int k = x % 10;
            ans += (k - 1) * 10;
            int len = String.valueOf(x).length();
            ans += (len * (len + 1)) / 2;
            System.out.println(ans);
        }
        sc.close();
    }
}