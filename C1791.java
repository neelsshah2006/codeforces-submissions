import java.util.Scanner;

public class C1791 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            int n = sc.nextInt();
            String s = sc.next();
            int count = 0;

            for (int i = 0; i < n / 2; i++) {
                if (s.charAt(i) != s.charAt(n - i - 1))
                    count += 2;
                else
                    break;
            }

            System.out.println(n - count);
        }
        sc.close();
    }
}
