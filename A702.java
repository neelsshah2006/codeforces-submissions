import java.util.Scanner;

public class A702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int maxCount = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (i > 0 && arr[i] > arr[i - 1]) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
        }
        sc.close();

        System.out.println(Math.max(maxCount, count));
    }
}