import java.util.Scanner;

public class C371 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int nb = sc.nextInt();
        int ns = sc.nextInt();
        int nc = sc.nextInt();
        int pb = sc.nextInt();
        int ps = sc.nextInt();
        int pc = sc.nextInt();
        long r = sc.nextLong();
        sc.close();

        long left = 0;
        long right = 1000000000000000L;
        long count = 0;
        long rb = s.chars().filter(c -> c == 'B').count();
        long rs = s.chars().filter(c -> c == 'S').count();
        long rc = s.chars().filter(c -> c == 'C').count();
        while (left <= right) {
            long mid = left + ((right - left) / 2);

            long needB = Math.max(0, mid * rb - nb);
            long needS = Math.max(0, mid * rs - ns);
            long needC = Math.max(0, mid * rc - nc);

            long cost = needB * pb + needS * ps + needC * pc;

            if (cost <= r) {
                count = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(count);
    }
}