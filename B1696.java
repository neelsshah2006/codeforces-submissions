import java.util.Scanner;

public class B1696 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            boolean gap = false;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a == 0) {
                    if (gap) {
                        count++;
                        gap = false;
                    }
                } else {
                    if (!gap)
                        gap = true;
                }
            }
            if (gap) {
                count++;
                gap = false;
            }
            System.out.println(count < 2 ? count : 2);
        }
        sc.close();
    }
}