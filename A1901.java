import java.util.Scanner;

public class A1901 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n + 1];
            int k = 0;
            int max = 0;
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt() - k;
                k += a[j];
                max = Math.max(max, a[j]);
            }
            a[n] = x - k;
            max = Math.max(max, 2 * a[n]);
            System.out.println(max);
        }
        sc.close();
    }
}
