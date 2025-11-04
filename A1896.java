import java.util.Scanner;

public class A1896 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            int n = sc.nextInt();
            int first = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (i == 0)
                    first = a;
                if (a < min)
                    min = a;
            }
            if (first == min)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
