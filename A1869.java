import java.util.Scanner;

public class A1869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            for (int i = 1; i < n; i++) {
                a ^= sc.nextInt();
            }

            if (a == 0) {
                System.out.println(1);
                System.out.println(1 + " " + n);
                continue;
            }

            if (n % 2 == 0) {
                System.out.println(2);
                System.out.println(1 + " " + n);
                System.out.println(1 + " " + n);
            } else {
                System.out.println(4);
                System.out.println(1 + " " + n);
                System.out.println(1 + " " + (n - 1));
                System.out.println((n - 1) + " " + n);
                System.out.println((n - 1) + " " + n);
            }
        }
        sc.close();
    }
}
