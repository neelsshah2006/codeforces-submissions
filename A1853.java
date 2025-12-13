import java.util.Scanner;

public class A1853 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int prev = sc.nextInt();
            int min = Integer.MAX_VALUE;
            for (int i = 1; i < n; i++) {
                int next = sc.nextInt();
                min = Math.min(min, next - prev);
                prev = next;
            }

            if (min < 0) {
                System.out.println(0);
                continue;
            }
            System.out.println(min / 2 + 1);
        }
        sc.close();
    }
}
