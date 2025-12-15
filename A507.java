import java.util.Arrays;
import java.util.Scanner;

public class A507 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int[] original = arr.clone();
        Arrays.sort(arr);
        int d = 0;
        int i = 0;
        while (i < n && d + arr[i] <= k) {
            d += arr[i];
            i++;
        }

        System.out.println(i);
        if (i == 0)
            return;
        for (int a = 0; a < i; a++) {
            for (int j = 0; j < n; j++) {
                if (arr[a] == original[j]) {
                    System.out.print((j + 1) + " ");
                    original[j] = -1;
                    break;
                }
            }
        }
        System.err.println();
    }
}
