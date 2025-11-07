import java.util.Scanner;

public class A1834 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int positive = 0;
            int negative = 0;
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if (num == 1) {
                    positive++;
                } else if (num == -1) {
                    negative++;
                }
            }

            int changes = 0;
            if (positive < negative) {
                changes += (int) Math.ceil((float) (negative - positive) / 2);
                negative -= changes;
                positive += changes;
            }

            if (negative % 2 != 0) {
                changes += 1;
            }

            System.out.println(changes);
        }
        sc.close();
    }
}