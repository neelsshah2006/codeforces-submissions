import java.util.Scanner;

public class D1807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] arr = new int[n];
            arr[0] = sc.nextInt();
            for (int i = 1; i < n; i++) {
                arr[i] = arr[i - 1] + sc.nextInt();
            }

            for (int i = 0; i < q; i++) {
                int l = sc.nextInt() - 1;
                int r = sc.nextInt() - 1;
                int k = sc.nextInt();
                int len = r - l + 1;
                int prev = l > 0 ? arr[l - 1] : 0;
                int s = k * len - arr[r] + prev;
                System.out.println((arr[n - 1] + s) % 2 != 0 ? "YES" : "NO");
            }
        }
        sc.close();
    }
}