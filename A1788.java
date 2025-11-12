import java.util.Scanner;

public class A1788 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int twos = 0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 2)
                    twos++;
            }

            if (twos % 2 == 0) {
                int a = twos / 2;
                int i = a == 0 ? 1 : 0;
                while (a > 0) {
                    if (arr[i] == 2) {
                        a--;
                    }
                    i++;
                }

                System.out.println(i);
            } else {
                System.out.println(-1);
            }
        }
    }
}