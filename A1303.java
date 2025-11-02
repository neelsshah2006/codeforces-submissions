import java.util.Scanner;

public class A1303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String n = sc.next();
            int length = n.length();
            int a = 0;
            int leadingZeros = 0;
            while (a < length && n.charAt(a) == '0') {
                a++;
                leadingZeros++;
            }
            int ones = 0;
            while (a < length) {
                if (n.charAt(a) == '1')
                    ones++;
                a++;
            }

            a = length - 1;
            int trailingZeros = 0;
            while (a >= 0 && n.charAt(a) == '0') {
                trailingZeros++;
                a--;
            }
            System.out.println(Math.max(length - leadingZeros - trailingZeros - ones, 0));
        }
        sc.close();
    }
}