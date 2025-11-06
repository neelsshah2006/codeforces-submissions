import java.util.Scanner;

public class A1814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            t--;

            long n = sc.nextLong();
            long k = sc.nextLong();
            long a = n % k;
            if (a % 2 == 0 || n % 2 == 0 || (a + k) % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
