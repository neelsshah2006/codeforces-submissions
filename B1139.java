import java.util.Scanner;

public class B1139 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int a = n - 1;
        long total = 0;
        long prev = Long.MAX_VALUE;
        while (a >= 0) {
            if (prev == 0)
                break;

            if (arr[a] < prev) {
                total += arr[a];
                prev = arr[a];
            } else {
                total += prev - 1;
                prev--;
            }

            a--;
        }

        System.out.println(total);
    }
}