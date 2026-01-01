import java.util.Scanner;

public class A1903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            boolean isInc = true;
            int prev = sc.nextInt();
            for (int i = 0; i < n - 1; i++) {
                int curr = sc.nextInt();
                if (curr < prev)
                    isInc = false;
                prev = curr;
            }

            System.out.println(k > 1 || isInc ? "YES" : "NO");
        }
        sc.close();
    }
}