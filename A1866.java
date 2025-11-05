import java.util.Scanner;

public class A1866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int a = Math.abs(sc.nextInt());
            if (a < min) {
                min = a;
            }
        }
        sc.close();
        System.out.println(min);
    }
}
