import java.util.Scanner;

public class A1878 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            boolean ans = false;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a == k)
                    ans = true;
            }

            System.out.println(ans ? "YES" : "NO");
        }
        sc.close();
    }
}
