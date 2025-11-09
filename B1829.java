import java.util.Scanner;

public class B1829 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int max = 0;
            int bspace = 0;
            for (int i = 0; i < n; i++) {
                if (sc.nextInt() == 0) {
                    bspace++;
                } else {
                    max = Math.max(max, bspace);
                    bspace = 0;
                }
            }

            System.out.println(Math.max(max, bspace));
        }
        sc.close();
    }
}
