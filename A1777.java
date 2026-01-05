import java.util.Scanner;

public class A1777 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int prev = sc.nextInt();
            boolean isEven = prev % 2 == 0;
            int ops = 0;
            for (int i = 0; i < n - 1; i++) {
                int x = sc.nextInt();
                boolean parity = x % 2 == 0;
                if (isEven == parity) {
                    ops++;
                    int product = prev * x;
                    isEven = product % 2 == 0;
                    x = product;
                } else
                    isEven = parity;
                prev = x;
            }

            System.out.println(ops);
        }
        sc.close();
    }
}