import java.util.Scanner;

public class A1805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int xor = sc.nextInt();
            for (int i = 1; i < n; i++) {
                xor ^= sc.nextInt();
            }

            if (n % 2 == 0) {
                if (xor == 0)
                    System.out.println(0);
                else
                    System.out.println(-1);
            } else {
                System.out.println(xor);
            }
        }
        sc.close();
    }
}