import java.util.Scanner;

public class A144 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int maxI = 0, minI = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a <= min) {
                min = a;
                minI = i;
            }

            if (a > max) {
                max = a;
                maxI = i;
            }
        }
        sc.close();

        System.out.println(maxI + n - 1 - minI - (maxI > minI ? 1 : 0));
    }
}
