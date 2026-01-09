import java.util.Scanner;

public class A1789 {
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }

    private static boolean beautiful(int a[], int n) {
        int g = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                g = Math.min(gcd(a[i], a[j]), g);
            }
        }
        if (g > 2)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            boolean isBeautiful = beautiful(arr, n);

            System.out.println(isBeautiful ? "Yes" : "No");
        }
        sc.close();
    }
}
