import java.util.Scanner;

public class B1883 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int[] chars = new int[26];

            for (char c : s.toCharArray()) {
                chars[c - 'a']++;
            }

            int sum = 0;
            for (int i = 0; i < 26; i++) {
                sum += chars[i] % 2;
            }

            if ((n - k) % 2 == 0) {
                if (sum > k) {
                    System.out.println("NO");
                    continue;
                }
                System.out.println((k - sum) % 2 == 0 ? "YES" : "NO");
            } else {
                if (sum - 1 > k) {
                    System.out.println("NO");
                    continue;
                }
                System.out.println("YES");
            }
        }
        sc.close();
    }
}